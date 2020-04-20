package com.company;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;

import java.util.Date;

public class Data {
    public static Date data(String a) {

        Scanner tastiera = new Scanner(System.in);
        Date d = null;
        Date corrente = new Date();
        boolean confronto;
        boolean flag1 = false;
        boolean flag2 = false;

        DateFormat formatoData = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ITALY);
        do {
            try {
                formatoData.setLenient(false);
                d = formatoData.parse(a);
                confronto = d.after(corrente);
                while (confronto == true && flag1 == false) {
                    System.out.println("Data inserita successiva a quella corrente");
                    a = tastiera.nextLine();
                    d = formatoData.parse(a);
                    if (d.after(corrente))
                        flag1 = false;
                    else
                        flag1 = true;
                }
                System.out.println("La data inserita è " + d);
                break;
            } catch (ParseException e) {
                System.out.println("Formato data non valido - Reinserisci");
                a = tastiera.nextLine();
                flag2 = true;

            }
        } while (flag2 == true);


        return d;
    }
}



