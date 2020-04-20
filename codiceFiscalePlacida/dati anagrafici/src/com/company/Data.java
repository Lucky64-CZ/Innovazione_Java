package com.company;
import java.text.DateFormat;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class Data {
    public static Date data(String a) {

    String s;
    Date d= null;
    Date corrente = new Date();
    boolean flag = false;
    boolean confronto;
    boolean flag2=false;
    Scanner input= new Scanner(System.in);
    s = a;
    DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT,Locale.ITALY);
    do {
        try {
            formatoData.setLenient(false);
            d= formatoData.parse(s);
            confronto =  d.after(corrente);
            while(confronto == true && flag == false){
                System.out.println("Data successiva a quella corrente");
                s = input.nextLine();
                d = formatoData.parse(s);
                if( d.after(corrente))
                    flag = false;
                else
                    flag = true;
            }
            System.out.println("La data inserita è " + d);
            break;
        } catch (ParseException e) {
           System.out.println("formato data non valido,reinsrisci");
           s = input.nextLine();
           flag2=true;
         }
        } while (flag2==true);
         return(d);
  }
}
