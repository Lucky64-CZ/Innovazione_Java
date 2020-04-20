package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class citta {

        public static String codiceComune(String comuneDaTrovare, String pathName) throws FileNotFoundException {
        boolean found = false;
        File f = new File("Database.txt");
        String ricerca = "";
        String id = "";
        String idcatasto = "";
        String comune = "";
        Scanner q = new Scanner(f);
        q.useDelimiter("[,\n]");
        String nonTrovato = "Non trovato";

        while(q.hasNext() && !found) {
        id = q.next();
        idcatasto = q.next();
        comune = q.next();
        System.out.println(id);
        System.out.println(idcatasto);
        System.out.println("-" + comune + "-");
        System.out.println("-" + comuneDaTrovare + "-");
        if (citta.equals(comuneDaTrovare)) {
        found = true;
        }
        }

        System.out.println("-" + comune + "-");
        System.out.println("-" + comuneDaTrovare + "-");
        if (found) {
        System.out.println("Il codice catastale di " + comune + " è " + idcatasto);
        return idcatasto;
        } else {
        return nonTrovato;
        }
        }
        }