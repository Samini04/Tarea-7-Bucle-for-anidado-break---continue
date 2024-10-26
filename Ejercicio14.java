import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            // Espacios en blanco para centrar los números
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            // Imprimir los números de 1 hasta `i`
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
