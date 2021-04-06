package Pizzeria.Main;

import Pizzeria.Clases.Panini;
import Pizzeria.Clases.Pizza;
import Pizzeria.Enums.Descripcion;
import Pizzeria.Enums.Tamanio;
import Pizzeria.Enums.Tipo;

public class Main {

    public static void main(String[] args) {
        Pizza margaritaFamiliar = new Pizza(Tipo.MARGARITA, Tamanio.FAMILIAR);
        Pizza funghiMediana = new Pizza(Tipo.FUNGHI, Tamanio.MEDIANO);
        Pizza cuatroQuesosFamiliar = new Pizza(Tipo.CUATRO_QUESO, Tamanio.FAMILIAR);

        Panini cuatroQuesosGranada = new Panini(Tipo.CUATRO_QUESO,false, Descripcion.GRANADA);
        Panini margaritaServillaDoble = new Panini(Tipo.MARGARITA,true, Descripcion.SEVILLA);

        System.out.println(margaritaFamiliar.toString()+"\n");
        System.out.println(funghiMediana.toString()+"\n");
        System.out.println(cuatroQuesosFamiliar.toString()+"\n");

        System.out.println(cuatroQuesosGranada.toString()+"\n");
        System.out.println(margaritaServillaDoble.toString()+"\n");

        cuatroQuesosGranada.estado();
        margaritaFamiliar.estado();

        funghiMediana.servir();
        cuatroQuesosFamiliar.servir();
        System.out.println(funghiMediana.toString()+"\n");
        System.out.println(cuatroQuesosFamiliar.toString()+"\n");
        cuatroQuesosGranada.servir();
        System.out.println(cuatroQuesosGranada.toString()+"\n");

        cuatroQuesosGranada.estado();
        margaritaFamiliar.estado();
    }
}
