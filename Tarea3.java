import java.util.Scanner;

public class Tarea3 {
    public static boolean validaSecuencia(String secuencia){
        boolean valido = true;
        if (secuencia.length() != 9){
            valido = false;
            System.out.println("La cadena tiene mas de 9 elementos");
        }
        if (!secuencia.matches(".*[XO_].*")){
            valido= false;
            System.out.println("Los caracteres no son validos");
        }
        return valido;

    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una cadena de caracteres: ");
        String cadena = teclado.nextLine();

        if(validaSecuencia(cadena)==true) {
            System.out.println("La cadena es: " + cadena);

            System.out.println("|" + cadena.substring(0, 3) + "|");
            System.out.println("|" + cadena.substring(3, 6) + "|");
            System.out.println("|" + cadena.substring(6, 9) + "|");
        }

    }
}
