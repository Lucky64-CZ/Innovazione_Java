package com.company;

public class Nome {
    public static String codnome(String nome) {

        String consnome = "";
        String codicecons = "";
        String vocalinome = "";
        char lettera = 'a';
        char[] consonanti = new char[10]; //VETTORE CONSONANTI
        char [] vocali = new char [10];
        int i, j, totcons=0, totvocali=0;
        for (i = 0; i < nome.length(); i++) {
            lettera = nome.charAt(i);
            if (lettera != 'A' && lettera != 'E' && lettera != 'I' && lettera != 'O' && lettera != 'U') {
                consnome += lettera;
                totcons++;
            } else {
                vocalinome += lettera;
                totvocali++;
            }
        }

        if (totcons > 3){
            codicecons = consnome.charAt(0) + "" + consnome.charAt(2) + "" + consnome.charAt(3);

        } else if (totcons == 2) {
            codicecons = consnome.charAt(0) + "" + consnome.charAt(1);
            codicecons = codicecons + "" + vocalinome.charAt(0);
        } else if (totcons ==1 && totvocali >=2) {
            codicecons = consnome.charAt(0) + "" + vocalinome.charAt(0) + "" + vocalinome.charAt(1);

        } else if (totcons ==1 && totvocali ==1) {
            codicecons = consnome.charAt(0) + "" + vocalinome.charAt(0) + "" + "X";
        } else if (totcons == 0 && totvocali >=2) {
            codicecons = vocalinome.charAt(0) + ""+ vocalinome.charAt(1) + ""+ "X";

        } else if (totcons == 3){
            codicecons = consnome.charAt(0) + "" + consnome.charAt(1) + "" + consnome.charAt(2);

        }
return (codicecons);
    }
}
