
package app;

import java.util.Scanner;

public class Arl27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n="140100905";
        String n2="2451004";
        String nc="";
        String nc2="";
        int nci=0,nci2=0;
        for(int i=0; i<n.length() ;i++){
            if(n.charAt(i)!='0'){
            nc=nc+n.charAt(i);
            
        }            
        }
        for(int i=0; i<n2.length() ;i++){
            if(n2.charAt(i)!='0'){
            nc2=nc2+n2.charAt(i);           
        }            
        }
       
         nci= Integer.parseInt(nc);
        nci2= Integer.parseInt(nc2);
           if (nci>nci2 ){
               System.out.println("EL mayor es: "+nci);    
               System.out.println("EL menor es: "+nci2);               
           }else {
               System.out.println("EL mayor es: "+nci2);
               System.out.println("EL menor es: "+nci);
           }
           
    }
}
