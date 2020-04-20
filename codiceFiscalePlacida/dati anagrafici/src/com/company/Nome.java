
package com.company;

public class Nome {
    public static String nomecompleto(String a) {
        char[] alfa = new char[]{'B', 'C', 'D', 'F', 'G', 'H', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'Z', 'K', 'W', 'J', 'Y'};
        String x = a.toUpperCase();
        char[] charnome = x.toCharArray();
        char lettera ='a';
        String nomeconsonanti = "";
        String nomecodice = "";
        String nomevocali = "";
        int i;
        int numcon = 0;
        int vocal =0;

        for (i = 0; i < charnome.length; i++) {

               lettera = charnome[i];
                if ((lettera != 'A') && (lettera != 'E') && (lettera != 'I') && (lettera!= 'O') && (lettera != 'U')) {

                    nomeconsonanti += lettera;
                    numcon++;

                } else{
                            nomevocali += lettera;
                            vocal++;

                }
        }
        if (numcon > 3) {
            nomecodice = nomeconsonanti.charAt(0) + "" + nomeconsonanti.charAt(2) + "" + nomeconsonanti.charAt(3);

        } else if (numcon ==2) {

                nomecodice = nomeconsonanti.charAt(0) + "" + nomeconsonanti.charAt(1) ;
                nomecodice = nomecodice+""+ nomevocali.charAt(0);

            } else if (numcon == 1 && vocal >= 2 ) {

                    nomecodice = nomeconsonanti.charAt(0) + "" + nomevocali.charAt(0) + "" + nomevocali.charAt(1);

                }else if (numcon == 1 && vocal == 1) {

                    nomecodice = nomeconsonanti.charAt(0) +""+ nomevocali.charAt(0) +""+ "X";

                } else if (numcon == 0 && vocal >=2){

                    nomecodice = nomevocali.charAt(0) +""+ nomevocali.charAt(1) +""+ "X";

               } else if( numcon==3){

                nomecodice = nomeconsonanti.charAt(0)+""+nomeconsonanti.charAt(1)+""+nomeconsonanti.charAt(2);
              }
            return nomecodice;
    }
}







