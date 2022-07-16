package app;

import java.util.Scanner;

public class Arl33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int exponente = 0;
        int base = 0;

        System.out.println("ingrese la base: ");
        base = input.nextInt();
        System.out.println("ingrese el exponente: ");
        exponente = input.nextInt();

        System.out.println("El resultado es: " + elevar(base, exponente));

    }

    public static double elevar(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}
