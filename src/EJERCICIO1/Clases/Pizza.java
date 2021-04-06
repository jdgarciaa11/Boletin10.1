package EJERCICIO1.Clases;

import EJERCICIO1.Enums.*;

public class Pizza extends FastFood{
    private Tamanio tamanio;
    private static int numPedidosPizza;
    private static int numServidosPizza;

    public Pizza(Tipo tipo, Tamanio tamanio) {
        super(tipo);
        this.tamanio = tamanio;
        numPedidosPizza++;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public static int getNumPedidosPizza() {
        return numPedidosPizza;
    }

    public static int getNumServidosPizza() {
        return numServidosPizza;
    }

    public void estado() {
        System.out.println("Estado Pizza"+
                "\nPedidios: "+numPedidosPizza+
                "\nServidos: "+numServidosPizza+
                "\n");
    }

    @Override
    public void servir() {
        super.servir();
        numServidosPizza++;
    }

    @Override
    public String toString() {
        return "Pizza " +
                "\nTipo=" + tipo +
                "\nEstado=" + estado +
                "\nTamaño=" + tamanio;
    }
}
