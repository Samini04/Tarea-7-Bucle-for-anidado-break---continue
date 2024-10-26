import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número:");
        int num;
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print("*"); // Imprime * para posiciones impares
                } else {
                    System.out.print("+"); // Imprime + para posiciones pares
                }
            }
            System.out.println();
        }
    }
}
