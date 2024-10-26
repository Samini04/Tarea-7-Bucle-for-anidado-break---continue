import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();
        boolean esPrimo= true;

        // Comprobación de divisibilidad desde 2 hasta num - 1
        if(num >1) {
            for (int i=2; i< num; i++) {
                if (num %i == 0 ) {
                    esPrimo= false;
                }
            }
        } else {
            esPrimo = false; // Números <= 1 no son primos
        }
        if (esPrimo) {
            System.out.println(num + " es nu numero primo.");
        } else {
            System.out.println(num + " no es nu numero primo.");
        }
        scanner.close();
    }
}

