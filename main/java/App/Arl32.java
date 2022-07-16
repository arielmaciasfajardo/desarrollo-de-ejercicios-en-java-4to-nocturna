package app;

import java.util.Scanner;

public class Arl32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int edad = 0;
        double promedio = 0;
        int contador = 0;
        double suma = 0;

        System.out.println("ingrese una edad: ");
        edad = input.nextInt();
        suma += solicitar(edad);
        while (edad != 0) {
            System.out.println("ingrese una edad: ");
            edad = input.nextInt();
            suma += solicitar(edad);
            if (edad > 18) {
                contador++;
            }
            System.out.println("Digite 0 para finalizar...");
        }
        promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
    }

    public static double solicitar(int edad) {
        if (edad > 18) {
            return edad;
        } else {
            return 0;
        }
    }
}
