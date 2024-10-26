import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num = scanner.nextInt();

        // Parte Superior (triángulo alineado a la izquierda)
        for (int i=0; i< num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Línea central
        for (int i=0; i<num; i++) {
            System.out.print("* ");
        }
        System.out.println();

        // Parte inferior (triángulo alineado a la derecha)
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

