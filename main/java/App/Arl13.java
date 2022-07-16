package app;

import java.util.Scanner;

public class Arl13 {

    public static void main(String[] args) {
        int N;
        int aux;
        int inverso = 0;
        int cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingres un número menor o igual a  10: ");
            N = sc.nextInt();
        } while (N < 10);

        aux = N;
        while (aux != 0) {
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (N == inverso) {
            System.out.println("Es capicuo");
        } else {
            System.out.println("No es capicuo");
        }
    }
}
