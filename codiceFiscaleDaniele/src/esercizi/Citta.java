package esercizi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Citta {

    public static String codiceCitta(String cittaDaTrovare, String pathName) throws FileNotFoundException {
        boolean found = false;
        File f = new File(pathName);
        String ricerca = "";
        String i="";
        String codice="";
        String citta="";
        Scanner q = new Scanner(f);
        q.useDelimiter("[,\n]");
        String nonTrovato=("Non trovato");

        while ((q.hasNext( )) && (!found)) {
            i = q.next( );
            codice = q.next( );
            citta = q.next( );
            System.out.println( i );
            System.out.println( codice );
            System.out.println( "-"+citta+"-" );
            System.out.println( "-"+cittaDaTrovare+"-" );

            if (citta.equals(cittaDaTrovare)) {
                found = true;
            }
        }
        System.out.println( "-"+citta+"-" );
        System.out.println( "-"+cittaDaTrovare+"-" );
        /*if {
                System.out.println("Città non presente nel Database");
                break;
            }*/
        if (found) {
            System.out.println( "Il codice catastale di "+citta+ " è "+codice);
            return codice;
    }
        else
            return nonTrovato;
}
    }
