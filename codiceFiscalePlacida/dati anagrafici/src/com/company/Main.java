package com.company;
import java.util.Scanner;
import java.text.DateFormat;
import java.util.Date;
public class Main {

    public static void main(String[] args) {

        String s;
        Date d = null;
        String nome =new String ();
        String cognome=new String();
        String citta=new String();
        String data= new String();
        String sesso1=new String ();
        Scanner input = new Scanner(System.in);

        System.out.println("inserisci il nome");
        nome=input.nextLine();
        nome=nome.replaceAll("   ","");

        System.out.println(nome.toUpperCase());



        System.out.println("inserisci il cognome");
        cognome=input.nextLine();
        cognome=cognome.replaceAll(" ","");
        System.out.println(cognome.toUpperCase());


        System.out.println("inserisci la città");
        citta=input.nextLine();
        citta=citta.replaceAll(" ","");
        System.out.println(citta.toUpperCase());

        System.out.println("inserisci la data di nascita");
        s = input.nextLine();
        System.out.println(Data.data(s));

        System.out.println("inserisci il sesso: M o F");
        String sess1= input.nextLine();
        String sess = Sesso.sesso(sess1);

        String codice = new String ();

        char anno = s.charAt(8);
        char anno2 =s.charAt(9);
        codice = anno +""+ anno2;

        char mese1 = s.charAt(3);
        char mese2 = s.charAt(4);
        String mesefin = mese1+""+mese2;
        int mese = Integer.parseInt(mesefin);

        char mes = Mesi.mesi(mese);
        codice = codice+ ""+ mes;

        char giorno1 = s.charAt(0);
        char giorno2 = s.charAt(1);
        String Giorno = giorno1+ ""+giorno2;
        int giorn = Integer.parseInt(Giorno);
        String formatter=String.format("%02d",giorn);
        if (sess.equals("M")){

            codice = codice+""+Giorno;
        }
     else  {

         giorn = giorn +40;
         Giorno = Integer.toString(giorn);
         codice = (codice+ ""+ Giorno);
     }
        String nom = new String ();
        nom = Nome.nomecompleto(nome);
        codice = nom+""+codice;

        String cogn = new String ();
        cogn= Cognome.cognomecompleto(cognome);
        codice =cogn+""+codice;
        System.out.println(codice);
    }

}
