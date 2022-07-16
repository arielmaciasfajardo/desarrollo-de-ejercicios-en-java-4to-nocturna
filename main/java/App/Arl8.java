

package app;


import java.util.Scanner;

class Arl8 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
  
        System.out.println("Ingrese un número:");
      
        double numero = escaner.nextDouble();
     
        if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }

    }
}
