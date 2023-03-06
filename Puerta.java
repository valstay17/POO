import java.awt.*;

public class Puerta {

    private String tamanio;
    private Color color;
    private String material;
    private double ancho;
    private String cerradura;

    public Puerta() {
    }

    public Puerta(String tamanio, Color color, String material, double ancho, String cerradura) {
        this.tamanio = tamanio;
        this.color = color;
        this.material = material;
        this.ancho = ancho;
        this.cerradura = cerradura;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getCerradura() {
        return cerradura;
    }

    public void setCerradura(String cerradura) {
        this.cerradura = cerradura;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "tamanio='" + tamanio + '\'' +
                ", color=" + color +
                ", material='" + material + '\'' +
                ", ancho=" + ancho +
                ", cerradura=" + cerradura +
                '}';
    }

    public boolean abrir(){
        System.out.println("La puerta de "+material + "esta abierta" );
        return true;
    }
}
