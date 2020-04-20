package esercizi;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
        String nome1 = input.nextLine( ).toUpperCase( ).replaceAll("  ", "").trim( );
        /*if (nome1.matches("a-z"))   {
            return true;}
            else
                return false;
        }*/
        System.out.println("Hai scritto: " + nome1);
        nome1=nome1.replaceAll(" ","");

        System.out.println("Inserisci il tuo cognome:");
        String cognome1 = input.nextLine( ).toUpperCase( ).trim( ).replace("  ", "");
        System.out.println("Hai scritto: " + cognome1);
        cognome1=cognome1.replaceAll(" ","");


        System.out.println("Inserisci la tua data di nascita (nel formato GG/MM/AAAA):");
        String data = input.nextLine( );
        Date dataInserita=new Date();
        Date currentDate=new Date();
   /*     Calendar annoCorrente = GregorianCalendar.getInstance( );
        final int mioAnno=annoCorrente.get(Calendar.YEAR);
        System.out.println("ANNO CORRENTE:" + annoCorrente.get(Calendar.YEAR)+""+1);
        int annoCorrenteFinale=Integer.parseInt(annoCorrente.get(Calendar.YEAR));*/

        boolean errore = false;

        char carattereGiorno1 = data.charAt(0);
        char carattereGiorno2 = data.charAt(1);
        char carattereMese1 = data.charAt(3);
        char carattereMese2 = data.charAt(4);
        char carattereAnno1 = data.charAt(6);
        char carattereAnno2 = data.charAt(7);
        char carattereAnno3 = data.charAt(8);
        char carattereAnno4 = data.charAt(9);
        String stringaGiorno = carattereGiorno1 + "" + carattereGiorno2;
        int giornoFinale = Integer.parseInt(stringaGiorno);
        String stringaMese = carattereMese1 + "" + carattereMese2;
        int meseFinale = Integer.parseInt(stringaMese);
        String stringaAnno = carattereAnno1 + "" + carattereAnno2 + "" + carattereAnno3 + "" + carattereAnno4;
        int annoFinale = Integer.parseInt(stringaAnno);

        while (!errore) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);
                dataInserita = sdf.parse(data);
                ;
                /*sdf.applyPattern("dd MMM yyyy");*/
                System.out.println("Hai inserito la data: ");
                System.out.printf("%2$td %2$tB %2$tY", "", dataInserita);
                errore = true;
            }

            catch (ParseException exc) {
                System.out.println("Riprova");
                if (giornoFinale > 31) {
                    System.out.println("Giorno sbagliato. Reinserisci:");

                }
                if (meseFinale > 12) {
                    System.out.println("Mese sbagliato. Reinserisci:");

                }
                if (dataInserita.after(currentDate) == true) {
                    System.out.println("Anno sbagliato. Reinserisci:");
                }
            }
            finally {

            }
            data = input.nextLine( );
        }

        System.out.println("Inserisci il tuo Comune di nascita:");
            String luogo1 = input.nextLine( ).toUpperCase( ).trim( ).replace("  ", "");
            System.out.println("Hai scritto: " + luogo1);

            System.out.println("Sesso (M/F):");
            String sesso1 = input.nextLine( ).toUpperCase( ).trim( ).replace(" ", "");
            String sesso = Sesso.sesso(sesso1);
            System.out.println("Hai scritto: " + sesso);

            char codice3 = CarattereMese.mese(meseFinale);

            if (sesso.equals("F")) {
                carattereGiorno1 += 4;
            }

        String nomeFinale=NomeCognome.codiceNomeCognome(nome1, true);
            String cognomeFinale=NomeCognome.codiceNomeCognome(cognome1,false);
            System.out.println(cognomeFinale+"" + nomeFinale + "" + carattereAnno3 +
                    "" + carattereAnno4 + "" + codice3 + "" + carattereGiorno1 +
                    "" + carattereGiorno2+""+Citta.codiceCitta(luogo1,"C:\\Users\\tarku\\Desktop\\c.txt"));


        }
    }


