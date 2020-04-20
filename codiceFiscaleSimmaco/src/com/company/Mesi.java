package com.company;

public class Mesi {
    public static char mesi(int a){
        String mesi= "ABCDEHLMPRST";
        String m;
        char mesereturn='a';
        int numero=a;
        int i;
        for(i=0;i<12;i++){
            if((numero - 1)==i){

                mesereturn =mesi.charAt(i);
            }
        }
        return mesereturn;
    }
}