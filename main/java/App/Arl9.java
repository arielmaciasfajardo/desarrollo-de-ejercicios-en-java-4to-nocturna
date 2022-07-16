package app;

import java.util.Scanner;

class Arl9{

    public static boolean findParity(int x) {

        x = (x & 0x0000FFFF) ^ (x >> 16);
        x = (x & 0x000000FF) ^ (x >> 8);
        x = (x & 0x0000000F) ^ (x >> 4);
        x = (x & 0x00000003) ^ (x >> 2);
        x = (x & 0x00000001) ^ (x >> 1);

        return (x & 1) == 1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = 0;
        System.out.println("Ingrese un numero: ");
        x = sc.nextInt();
        System.out.println(x + "  en binario es " + Integer.toBinaryString(x));

        if (findParity(x)) {
            System.out.println(x + " contiene bits impres");
        } else {
            System.out.println(x + " contiene bits paraes");
        }
    }
}
