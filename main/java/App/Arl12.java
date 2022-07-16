package app;

import java.util.Scanner;

public class Arl12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anio;
         System.out.println("Ingresa dia:");
          dia = sc.nextInt();
          System.out.println("Ingresa mes: ");
           mes = sc.nextInt();
        System.out.println("Ingresa año: ");
        anio = sc.nextInt();
        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            System.out.println("El año " + anio + " Si es bisiesto ");
        } else {
            System.out.println("El año " + anio + " No es bisiesto ");
        }
    }
}
