package EJERCICIO2.Main;

import EJERCICIO2.Clases.Interino;
import EJERCICIO2.Enums.CargoInterino;

public class Main {

    public static void main(String[] args) {
        Interino mar = new Interino("Mar","Acal",22,"2020-01-11","2021-04-09","Nervion", CargoInterino.PROFESOR);
        mar.duracionInternidad();
        mar.tiempoRestrante();
    }
}
