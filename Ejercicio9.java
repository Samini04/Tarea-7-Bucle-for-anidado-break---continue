import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        for (int i=0; i<num; i++) {
            // Agregar espacios en blanco para centrar el triángulo
            for(int j=0; j< num - i - 1; j++) {
               System.out.print(" ");

            }
            // Agregar espacios en blanco para centrar el triángulo
            for (int j=0; j< (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

