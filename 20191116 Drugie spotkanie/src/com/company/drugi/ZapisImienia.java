package com.company.drugi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ZapisImienia {
    final static String FILE_NAME = "zapis.txt";

    public static void main(String[] args) throws FileNotFoundException {
        Scanner podajImie = new Scanner(System.in);
        System.out.println("Podaj imię do zapisu: ");
        String noweImie = podajImie.nextLine();


        PrintWriter zapis = new PrintWriter(FILE_NAME);
        zapis.println(noweImie);
        zapis.close();

        File file = new File(FILE_NAME);
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        System.out.println(zdanie);

    }
}
