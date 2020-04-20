package esercizi;

public class NomeCognome {

    public static String vocaliStringa(String cognomeVocali) {
        cognomeVocali = cognomeVocali.toUpperCase( ).replaceAll("[^AEIOU]", "");
        return cognomeVocali;
    }

    public static String consonantiStringa(String cognomeConson) {
        cognomeConson = cognomeConson.toUpperCase( ).replaceAll("[AEIOU]", "");
        return cognomeConson;
    }

    public static String aggiungiVocali(String stringa) {
        int i = 0;
        String vocali= vocaliStringa(stringa);
        while ( stringa.length( ) < 3 ) {
            stringa += vocali.charAt(i);
            i++;
        }
        return stringa;
    }

    public static String codiceNomeCognome(String finale, boolean variabile) {
        String consonanti=consonantiStringa(finale);
        String vocali=vocaliStringa(finale);

        if (consonanti.length( ) == 3) {
            finale = consonanti.substring(0,3);
        } else if ((consonanti.length( ) < 3) && (finale.length( ) >= 3)) {
            finale = consonanti +"" + aggiungiVocali(vocali);
            finale=finale.substring(0,3);
        } else if ((consonanti.length( ) < 3) && (finale.length( ) < 3)) {
            finale = consonanti + "" +aggiungiVocali(vocali) + "" + "X";
            finale=finale.substring(0,3);
        } else if ((consonanti.length( ) > 3)) {
            if (!variabile) {
                finale = consonanti.substring(0, 3);
            }
            else {
                finale = consonanti.charAt(0)+""+consonanti.charAt(2)+""+consonanti.charAt(3);
            }
        }

        return finale;
    }

}



