package app;

import java.util.Scanner;

public class Arl36 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String ciudadOrigen = "";
        String ciudadDestino = "";
        double millas = 0;

        System.out.println("ingrese la ciudad de origen: ");
        ciudadOrigen = input.nextLine();
        System.out.println("ingrese la ciudad de destino: ");
        ciudadDestino = input.nextLine();
        System.out.println("ingrese la distancia en millas: ");
        millas = input.nextDouble();
        MillasAKilometros(ciudadOrigen, ciudadDestino, millas);
    }

    public static void MillasAKilometros(String ciudadO, String ciudadD, double millas) {
        double kilometros = millas * 1.609;
        System.out.println("Entre la Ciudad " + ciudadO + " y la Ciudad " + ciudadD + " hay " + kilometros + " Km");
    }
}
