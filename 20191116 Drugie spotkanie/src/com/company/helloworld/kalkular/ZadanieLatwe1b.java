package com.company.helloworld.kalkular;

import java.util.Scanner;

public class ZadanieLatwe1b {
    public static void main(String[] args) {
        int numberPow, pow, wynik;
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę którą chces podnieść do potęgi: ");
        numberPow = scan.nextInt();
        System.out.println("Podaj potęgę do któej ma być podniesiona: ");
        pow = scan.nextInt();
        wynik = numberPow;
        for (int i = 1; i < pow; i++) {
            wynik = wynik * numberPow;
        }
        System.out.println("Wynik: " + wynik);

    }
}
