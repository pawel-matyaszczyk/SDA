package com.company.drugi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ala {
    public static void main(String[] args) throws FileNotFoundException {
        File plik = new File("ala.txt");

        Scanner odczyt = new Scanner(new File("ala.txt"));

        System.out.println(odczyt.nextLine());
    }
}
