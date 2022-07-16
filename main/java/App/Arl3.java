package app;

import javax.swing.JOptionPane;

public class Arl3 {

    public static void main(String[] args) {
        int a1 = 0;
        int a2 = 0;
        int a = 200;
        int b = 5;
        int c = 6;
        a1 = (a + (b / c)) / ((a / b) + c);
        a2 = (a / (a + b)) / (a / (a - b));

        JOptionPane.showMessageDialog(null, "El resultado de la primera operacion es: " + a1
                + " \n El resultado de la seguda operacion es: " + a2);
    }
}
