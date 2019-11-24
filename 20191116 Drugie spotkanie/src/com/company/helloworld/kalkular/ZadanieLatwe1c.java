package com.company.helloworld.kalkular;

import java.util.Scanner;

public class ZadanieLatwe1c {
    public static void main(String[] args) {
        int silnia, wynik;
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę silnia: ");
        silnia = scan.nextInt();
         wynik = silnia;
        for (int i = 1; i < silnia; i++) {
            wynik = wynik * i;
        }
        System.out.println("Wynik: " + wynik);

    }
}
