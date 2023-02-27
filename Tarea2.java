import java.util.Scanner;

public class Tarea2 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una cadena de caracteres: ");
        String inicio = teclado.nextLine();

        boolean Secuencia = true;

        for (int i = 0; i < inicio.length() - 1; i++) {
            int serie1 = (int) inicio.charAt(i);
            int serie2 = (int) inicio.charAt(i + 1);

            if (serie2 - serie1 != 1) {
                Secuencia = false;
                break;
            }
        }
        System.out.printf("%nSi la secuencia de caracteres que la componen es una secuencia consecutiva\n" +
                "válida en la tabla de caracteres ASCII y false si no es una secuencia\n" +
                "consecutiva%n%n");
        System.out.println("La secuencia de caracteres ingresada es: " + Secuencia);
    }
}
