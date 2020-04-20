package com.company;
import java.util.Scanner;
public class Sesso {
    public static String sesso(String a) {

        Scanner input= new Scanner (System.in);
        String F="F";
        String M="M";
        String x=a.toUpperCase();
        while( (!x.equals(F))&&(!x.equals(M))){

            System.out.println("inserisci il sesso: M o F");
            x = input.nextLine();
            x=x.toUpperCase();
            System.out.println(x);
        }
        return(x);
    }




}
