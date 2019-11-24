package com.company.drugi;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ZapisPliku {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("ala2.txt");
        zapis.println("Ala ma kota a kot ma Alę.");
        zapis.close();
    }
}
