import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int num = scanner.nextInt();

        int contadorPrimos = 0; // Contador de números primos encontrados
        int i = 2; // Número que vamos a verificar si es primo

        while (contadorPrimos < num) {
            boolean esPrimo = true;

            // Verifica si 'i' es primo
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    esPrimo = false; // Si encontramos un divisor, no es primo
                }
            }

            // Si es primo, se imprime y se aumenta el contador
            if (esPrimo) {
                System.out.println(i);
                contadorPrimos++;
            }

            i++; // Avanza al siguiente número

        }

    }
}
