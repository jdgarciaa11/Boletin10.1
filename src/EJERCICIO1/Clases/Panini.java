package EJERCICIO1.Clases;

import EJERCICIO1.Enums.*;

public class Panini extends FastFood{
    private Boolean doble;
    private Descripcion descripcion;
    private static int numPedidosPanini;
    private static int numServidosPanini;

    public Panini(Tipo tipo, Boolean doble, Descripcion descripcion) {
        super(tipo);
        this.doble = doble;
        this.descripcion = descripcion;
        numPedidosPanini++;
    }

    public Boolean getDoble() {
        return doble;
    }

    public void setDoble(Boolean doble) {
        this.doble = doble;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    public void estado() {
        System.out.println("Estado Panini"+
                "\nPedidios: "+numPedidosPanini+
                "\nServidos: "+numServidosPanini+
                "\n");
    }

    @Override
    public void servir() {
        //TODO Comprobar servida es true
        super.servir();
        numServidosPanini++;
    }

    @Override
    public String toString() {
        return "Panini " +
                "\nTipo=" + tipo +
                "\nEstado=" + estado +
                "\nDoble=" + doble +
                "\nDescripcion=" + descripcion;
    }
}
