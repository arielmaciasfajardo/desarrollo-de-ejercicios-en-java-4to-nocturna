package app;

import java.util.Scanner;

public class Arl20 {

    public static void main(String[] args) {
        int mes = 0;
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 12: ");
        mes =ingresar.nextInt();
        switch (mes) {
            case 1:
                System.out.println("El mes correspondiente es Enero");
                break;
            case 2:
                System.out.println("El mes correspondiente es Febrero");
                break;
            case 3:
                System.out.println("El mes correspondiente es Marzo");
                break;
            case 4:
                System.out.println("El mes correspondiente es Abril");
                break;
            case 5:
                System.out.println("El mes correspondiente es Mayo");
                break;
            case 6:
                System.out.println("El mes correspondiente es Junio");
                break;
            case 7:
                System.out.println("El mes correspondiente es Julio");
                break;
            case 8:
                System.out.println("El mes correspondiente es Agosto");
                break;
            case 9:
                System.out.println("El mes correspondiente es Septiembre");
                break;
            case 10:
                System.out.println("El mes correspondiente es Octubre");
                break;
            case 11:
                System.out.println("El mes correspondiente es Noviembre");
                break;
            case 12:
                System.out.println("El mes correspondiente es Diciembre");
                break;

        }
    }

}
