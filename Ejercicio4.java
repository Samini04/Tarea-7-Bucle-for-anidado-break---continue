
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta la altura:");
        int altura;
        altura = sc.nextInt();

        System.out.println("Inserta la anchura:");
        int anchura;
        anchura = sc.nextInt();

        for (int i =0; i<altura; i++) {
            for (int j =0; j<anchura; j++) {
                System.out.print("#");

            }

            System.out.println();
        }


    }
}

