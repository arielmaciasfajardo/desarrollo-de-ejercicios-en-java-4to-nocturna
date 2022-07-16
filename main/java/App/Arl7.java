package app;

import java.util.Scanner;

public class Arl7 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Ingrese un número entero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("El numeroes par");
        } else {
            System.out.printf("El numero es impar");
        }
    }
}
