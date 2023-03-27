import java.util.Arrays;

public class Maquina {
    int agua = 5000;
    int cafe = 1000;
    int crema = 1500;
    int vasos = 50;

    public void Americano(){
        if (agua >= 180 && cafe >= 15 && vasos>0) {
            agua -= 180;
            cafe -= 15;
            vasos--;
            System.out.println("Servido");
        } else {
            System.out.println("No hay recursos suficientes");
        }


    }
    public void Expreso(){
        if (agua >= 120 && cafe >= 20 && vasos >0) {
            agua -= 120;
            cafe -= 20;
            vasos --;
            System.out.println("Servido");
        } else {
            System.out.println("No hay recursos suficientes");
        }

    }
    public void Capuchino(){
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos >0) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos--;
            System.out.println("Servido");
        } else {
            System.out.println("No hay recursos suficientes");
        }

    }
    public void estadoRecurso(){
        System.out.println("Recursos de la maquina:");
        System.out.println("Agua: " + agua);
        System.out.println("Café: " + cafe);
        System.out.println("Crema: " + crema);

    }
}
