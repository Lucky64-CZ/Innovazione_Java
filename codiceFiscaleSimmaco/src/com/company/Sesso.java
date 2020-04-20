package com.company;
import java.util.Scanner;
public class Sesso {
    public static String sesso (String a){
        Scanner tastiera = new Scanner (System.in);

        String x= a.toUpperCase();
        while( (!x.equals("F"))&&(!x.equals("M"))){

            System.out.println("inserisci sesso: M o F");
            x= tastiera.nextLine();
            x= x.toUpperCase();
            System.out.println(x);

        }
        return (x);
    }


}
