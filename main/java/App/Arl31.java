package app;

import java.util.Scanner;

public class Arl31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int N = 0;
        double suma = 0;
        double promedio = 0;
        int contador = 0;

        System.out.println("ingrese un numero: ");
        N = input.nextInt();

        suma += N;

        while (N != 0) {
            System.out.println("ingrese un numero: ");
            N = input.nextInt();
            suma += N;
            contador++;
        }
        promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
    }
}
