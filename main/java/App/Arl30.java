package app;

public class Arl30 {
    public static void main(String[] args) {
         String n0 = "", n1 = "", n2 = "", n3 = "", n4 = "", n5 = "", n6 = "";
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    n0 = "|" + i + "|" + j + "| ";
                } else if (i == 1) {
                    n1 += "|" + i + "|" + j + "| ";
                } else if (i == 2) {
                    n2 += "|" + i + "|" + j + "| ";
                } else if (i == 3) {
                    n3 += "|" + i + "|" + j + "| ";
                } else if (i == 4) {
                    n4 += "|" + i + "|" + j + "| ";
                } else if (i == 5) {
                    n5 += "|" + i + "|" + j + "| ";
                } else if (i == 6) {
                    n6 += "|" + i + "|" + j + "| ";
                }
            }

        }
        System.out.println(n0);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }
}
