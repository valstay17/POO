import java.awt.*;

public class Casa {
    private String ubicacion;
    private Color color;
    private int pisos;
    private boolean jardin;
    private int habitaciones;

    public Casa() {
    }

    public Casa(String ubicacion, Color color, int pisos, boolean jardin, int habitaciones) {
        this.ubicacion = ubicacion;
        this.color = color;
        this.pisos = pisos;
        this.jardin = jardin;
        this.habitaciones = habitaciones;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void getUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = 5;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "ubicacion='" + ubicacion + '\'' +
                ", color=" + color +
                ", pisos=" + pisos +
                ", jardin=" + jardin +
                ", habitaciones=" + habitaciones +
                '}';
    }
    public boolean consumo(){
        System.out.println("Consume mucha energia por la cantidad de habitaciones "+ habitaciones);
        return true;
    }
}
