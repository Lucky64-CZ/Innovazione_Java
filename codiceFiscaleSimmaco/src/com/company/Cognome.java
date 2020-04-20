package com.company;

public class Cognome {
    public static String codcognome(String cognome) {

        String conscognome = "";
        String codicecons = "";
        String vocalicognome = "";
        char lettera = 'a';
        char[] consonanti = new char[10]; //VETTORE CONSONANTI
        char [] vocali = new char [10];
        int i, j, totcons=0, totvocali=0;
        for (i = 0; i < cognome.length(); i++) {
            lettera = cognome.charAt(i);
            if (lettera != 'A' && lettera != 'E' && lettera != 'I' && lettera != 'O' && lettera != 'U') {
                conscognome += lettera;
                totcons++;
            } else {
                vocalicognome += lettera;
                totvocali++;
            }
        }
        if (totcons >= 3){
            codicecons = conscognome.charAt(0) + "" + conscognome.charAt(1) + "" + conscognome.charAt(2);

        } else if (totcons == 2) {
            codicecons = conscognome.charAt(0) + "" + conscognome.charAt(1) + ""+ vocalicognome.charAt(0);

        } else if (totcons ==1 && totvocali>=2 ) {
            codicecons = conscognome.charAt(0) + "" + vocalicognome.charAt(0) + "" + vocalicognome.charAt(1);
        } else if ( totcons ==1 && totvocali ==1) {
            codicecons = conscognome.charAt(0) + "" + vocalicognome.charAt(0) + "" + "X";
        } else if (totcons ==0 && totvocali >=2) {
            codicecons = vocalicognome.charAt(0) + ""+ vocalicognome.charAt(1) + "" + "X";
        }

        return (codicecons);

    }
}




