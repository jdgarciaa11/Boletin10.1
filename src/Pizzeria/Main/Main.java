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

        margaritaFamiliar.toString();
        funghiMediana.toString();
        cuatroQuesosFamiliar.toString();

        cuatroQuesosGranada.toString();
        margaritaServillaDoble.toString();

    }
}
