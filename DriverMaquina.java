import java.util.Scanner;

public class DriverMaquina {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Maquina maquina1 = new Maquina();

        boolean detener = false;
        while (!detener && maquina1.vasos > 0 && (maquina1.agua >= 180 || maquina1.cafe >= 20 || maquina1.crema >= 70)) {
            System.out.println();
            System.out.println("Seleccione el cafe o detener la maquina");
            System.out.println("1 Americano");
            System.out.println("2 Expreso");
            System.out.println("3 Capuchino");
            System.out.println("4 Detener");

            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    maquina1.Americano();
                    break;
                case 2:
                    maquina1.Expreso();
                    break;
                case 3:
                    maquina1.Capuchino();
                    break;
                case 4:
                    detener = true;
                    break;
                default:
                    System.out.println("No es valido");
                    detener= true;
                    break;
            }

            if(!detener){
                maquina1.estadoRecurso();
                if(maquina1.vasos == 0 || (maquina1.agua < 180 && maquina1.cafe < 20 && maquina1.crema < 70)) {
                    System.out.println("No hay suficientes recursos para servir más café.");
                    detener = true;
                }
            }


            }


        }


    }


