import java.awt.*;

public class Prueba {
    public static void main(String[] args) {
        Casa c = new Casa();
        c.setPisos(5);
        c.setJardin(true);
        c. setHabitaciones(8);
        System.out.println("La cantidad de pisos es: "+ c.getPisos());
        System.out.println(c.toString());
        Puerta p = new Puerta("mediana", Color.RED,"madera", 1.3,"digital");
        System.out.println(p.toString());

    }
}

