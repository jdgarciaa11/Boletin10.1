package EJERCICIO1.Clases;

import EJERCICIO1.Enums.*;

public class FastFood {
    protected Tipo tipo;
    protected Estado estado;

    public FastFood(Tipo tipo) {
        this.tipo = tipo;
        this.estado = Estado.PEDIDA;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void servir(){
        setEstado(Estado.SERVIDA);
    }
}
