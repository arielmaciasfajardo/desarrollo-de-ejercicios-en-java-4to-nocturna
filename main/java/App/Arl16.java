package app;

import javax.swing.JOptionPane;

public class Arl16{

    public static void main(String[] args) {
        double x = 0.0;
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de C:"));

        x = (-b + (Math.sqrt(Math.pow(b, 2) + (4 * a * c)))) / (2 * a);

        JOptionPane.showMessageDialog(null, x);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer numero: " + numero1 + " es el mayor");
            if (numero2 > numero3) {
                System.out.println("El segundo numero: " + numero2 + " es el segundo mayor");
                System.out.println("El tercer numero: " + numero3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + numero3 + " es el segundo mayor");
                System.out.println("El segundo numero: " + numero2 + " es el menor");
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El segundo numero: " + numero1 + " es el mayor");
            if (numero1 > numero3) {
                System.out.println("El primer numero: " + numero1 + " es el segundo mayor");
                System.out.println("El tercer numero: " + numero3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + numero3 + " es el segundo mayor");
                System.out.println("El primer numero: " + numero1 + " es el menor");
            }
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El tercer numero: " + numero3 + " es el mayor");
            if (numero1 > numero2) {
                System.out.println("El primer numero: " + numero1 + " es el segundo mayor");
                System.out.println("El segundo numero: " + numero2 + " es el menor");
            } else {
                System.out.println("El segundo numero: " + numero2 + " es el segundo mayor");
                System.out.println("El primer numero: " + numero1 + " es el menor");
            }
        }
    }
}
