package app;

import java.util.Scanner;

public class Arl6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el valor del cateto A: ");
        double a = input.nextDouble();
        System.out.print("Ingese el valor del cateto B: ");
        double b = input.nextDouble();

        a = Math.pow(a, 2);
        b = Math.pow(b, 2);

        double c = Math.sqrt(a + b);

        System.out.println("Valor de Hipotenusa es: " + c);
    }
}
