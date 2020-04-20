package com.company;

public class Cognome {
    public static String cognomecompleto (String a){

        char[] alfa = new char[]{'B', 'C', 'D', 'F', 'G', 'H', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'Z', 'K', 'W', 'J', 'Y'};
        /*  char[] vocal = new char []{'A','E','I','O','U'};*/
        String x = a.toUpperCase();
        char[] charcognome = x.toCharArray();
        char lettera ='a';
        String consonanti = "";
        String cognomecodice = "";
        String vocali = "";
        int i;
        int numcon = 0;
        int vocal = 0;

        for (i = 0; i < charcognome.length; i++) {

             lettera = charcognome[i];
                if ((lettera != 'A') && (lettera != 'E') && (lettera != 'I') && (lettera != 'O') && (lettera != 'U')) {

                    consonanti += lettera;
                    numcon++;

                } else {
                       vocali += lettera;
                       vocal++;
                    }
        }

        if (numcon > 3) {
            cognomecodice = consonanti.charAt(0) + "" + consonanti.charAt(1) + "" + consonanti.charAt(2);

        } else if (numcon == 2 ) {

                cognomecodice = consonanti.charAt(0) + "" + consonanti.charAt(1) + "" + vocali.charAt(0);

        } else if (numcon == 1 && vocal >=2 ) {

                    cognomecodice = consonanti.charAt(0) + "" + vocali.charAt(0) + "" + vocali.charAt(1);
                } else if (numcon == 1 && vocal == 1) {

                    cognomecodice = consonanti.charAt(0) + "" + vocali.charAt(0) + "" + "X";
                } else if( numcon ==0 && vocal >=2){

                    cognomecodice = vocali.charAt(0) +""+ vocali.charAt(1) +""+ "X";
                 }
        return cognomecodice;
    }
}

































