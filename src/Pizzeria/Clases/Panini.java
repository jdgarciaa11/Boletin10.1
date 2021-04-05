package Pizzeria.Clases;

import Pizzeria.Enums.*;

public class Panini extends FastFood{
    private Boolean doble;
    private Descripcion descripcion;
    private static int numPedidosPanini;
    private static int numServidosPizza;

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

    @Override
    public String toString() {
        return "Panini " +
                "\nTipo=" + tipo +
                "\nEstado=" + estado +
                "\nDoble=" + doble +
                "\nDescripcion=" + descripcion;
    }
}
