package esercizi;

import java.util.Scanner;

public class Sesso {
    public static String sesso (String a)   {
        Scanner input=new Scanner( System.in);
        String f="F";
        String m= "M";
        a=a.toUpperCase();
        while ((!a.equals(f))&&(!a.equals(m)))  {
            System.out.println("Reinserisci sesso (M o F):");
            a=input.nextLine().toUpperCase();
            System.out.println("Hai scritto: "+a);
        }
return a;

    }


}
