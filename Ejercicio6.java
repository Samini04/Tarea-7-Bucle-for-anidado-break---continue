import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Pedimos el número inicialmente
        System.out.println("Introduce un numero (o 0 para salir):");
        int num;
        num = sc.nextInt();

        // Mientras num no sea 0, ejecutamos el bucle
        for (;num != 0; ) {
            System.out.println("Tabla de multiplicar del " + num + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(num + " X " + j + " = " + num * j);
            }

            // Volvemos a pedir otro número
            System.out.println("Introduce un numero (o 0 para salir):");
            num = sc.nextInt();  // Si es 0, el bucle terminará
        }

        System.out.println("Programa finalizado.");
    }
}


