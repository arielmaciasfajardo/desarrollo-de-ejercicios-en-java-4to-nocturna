package app;

import java.util.Scanner;

public class Arl15 {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int segundos;
        int minutos;
        int horas;

        System.out.print("Ingrese una cantidad en segundos: ");
        segundos = Integer.parseInt(ingreso.next());
        horas = segundos / 3600;
        minutos = segundos / 60;
        System.out.println("EN HORAS : " + horas);
        System.out.println("EN MINUTOS : " + minutos);
    }
}
