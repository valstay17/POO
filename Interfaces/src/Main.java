public class Main {
    public static void main(String[] args) {
       Cuadrado cuadrado =new Cuadrado();
       cuadrado.setLado(5);
        System.out.println("El área del cuadrado es "+cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("El área del circulo es "+circulo.calcularArea());
    }

}