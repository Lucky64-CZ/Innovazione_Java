package com.company;



public class Codicenomecognome {
    public static String codicenome(String nome) {
        nome = nome.replaceAll("\\s+","");
        String consnome = "";
        String codicecons = "";
        String vocalinome = "";
        char lettera = 'a';
        int i, j, totcons = 0, totvocali = 0;
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
        } else if (totcons == 3){
            codicecons = consnome.charAt(0) + "" + consnome.charAt(1) + "" + consnome.charAt(2);
        } else if (totcons == 2) {
            codicecons = consnome.charAt(0) + "" + consnome.charAt(1) + "" + vocalinome.charAt(0);
        } else if (totcons == 1 && totvocali == 1){
            codicecons = consnome.charAt(0) + "" + vocalinome.charAt(0) + "" + "X";
        } else if (totcons == 0 && totvocali == 2) {
            codicecons = vocalinome.charAt(0) + "" + vocalinome.charAt(1) + "" + "X";
        }
        return (codicecons);
    }
    public static String codicecognome(String cognome){
        String conscognome = "";
        String codicecons = "";
        String vocalicognome = "";
        char lettera = 'a';
        int i, j, totcons = 0, totvocali = 0;
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
            codicecons = conscognome.charAt(0) + "" + conscognome.charAt(1) + "" + conscognome.charAt(2);;
        } else if (totcons == 2) {
            codicecons = conscognome.charAt(0) + "" + conscognome.charAt(1) + "" + vocalicognome.charAt(0);
        } else if (totcons == 1 && totvocali == 2){
            codicecons = conscognome.charAt(0) + "" + vocalicognome.charAt(0) + "" + vocalicognome.charAt(1);
        } else if (totcons == 1 && totvocali ==1){
            codicecons = conscognome.charAt(0) + "" + vocalicognome.charAt(0) + "" + "X";
        } else if (totcons == 0 && totvocali == 2) {
            codicecons = vocalicognome.charAt(0) + "" + vocalicognome.charAt(1) + "" + "X";
        }
        return (codicecons);
    }
}