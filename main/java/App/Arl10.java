package app;

import java.util.Scanner;

public class Arl10 {

    public static void main(String[] args) {
        long numero;
        long auxiliar;
        long digito;
        long entero;
        int exponente;
        boolean esBinario;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero binario: ");
            numero = sc.nextLong();

            esBinario = true;
            auxiliar = numero;
            while (auxiliar != 0) {
                digito = auxiliar % 10;
                if (digito != 0 && digito != 1) {
                    esBinario = false;
                }
                auxiliar = auxiliar / 10;
            }
        } while (!esBinario);

        exponente = 0;
        entero = 0;
        while (numero != 0) {

            digito = numero % 10;

            entero = entero + digito * (int) Math.pow(2, exponente);

            exponente++;

            numero = numero / 10;
        }
        System.out.println("Entero: " + entero);
    }
}
