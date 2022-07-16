package app;

import java.util.Scanner;

public class Arl26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = 0;
        String palabra = "";
        System.out.println("ingrese la contraseña");
        palabra = input.nextLine();
        N = palabra.length();
            while (N!=10) {
                System.out.println("Cantidad de digitos tienen que ser 10, vuelva a ingresarla");
                System.out.println("ingrese la contraseña");
                palabra = input.nextLine();
                N = palabra.length();
            }
             System.out.println("La contraseña es valida");
        }
    }
