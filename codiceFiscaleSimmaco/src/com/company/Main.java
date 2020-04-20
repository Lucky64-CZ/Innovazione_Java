package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner (System.in);
        String nome = new String();
        String cognome= new String();
        String citta = new String ();
        String s;
        Date d= null;


        System.out.println("inserisci nome");
        nome= tastiera.nextLine();
        nome= nome.replaceAll("\\s","");
        nome= nome.toUpperCase();
        System.out.println(nome.toUpperCase());

        System.out.println("inserisci cognome");
        cognome= tastiera.nextLine();
        cognome= cognome.replaceAll("\\s","");
        cognome= cognome.toUpperCase();
        System.out.println(cognome.toUpperCase());

        System.out.println("inserisci città");
        citta= tastiera.nextLine();
        citta=citta.replaceAll("\\s","");
        System.out.println(citta.toUpperCase());


        System.out.println("inserisci data");
        s=tastiera.nextLine();
        System.out.println(Data.data(s));

        char anno=  s.charAt (8);
        char anno2= s.charAt (9);
        String codice= anno +""+ anno2;
        System.out.println("inserisci sesso");
        String sess1= tastiera.next();
        String sess= Sesso.sesso(sess1);
        char mese1= s.charAt (3);
        char mese2= s.charAt (4);
        String mesefin= mese1+""+mese2;
        int mese= Integer.parseInt(mesefin);

        char mes= Mesi.mesi(mese);
        codice = codice + ""+ mes;
        char giorno1 = s.charAt(0);
        char giorno2 = s.charAt(1);
        String Giorno = giorno1+""+giorno2;
        int giorn = Integer.parseInt(Giorno);
        String formatted= String.format("%02d",giorn);
        if (sess.equals("M")){
        codice= codice+ ""+ Giorno;
        } else if (sess.equals("F")){
            giorn = giorn +40;
            Giorno = Integer.toString(giorn);
            codice = codice + ""+Giorno;
    }
        String consonanti=  Nome.codnome(nome);
        codice=consonanti + "" + codice; // lettere nome + codice = codice1

        String consonanticog= Cognome.codcognome(cognome);
        codice=consonanticog + "" + codice; //lettere cognome + codice1 = codice2


        System.out.println(codice);


    }

}


