package com.company.helloworld.kalkular;

import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {
        if (2 > 3) {
            System.out.println("ok1");
        } else {
            System.out.println("Nie ok");
        }
        if (4 < 5) {
            System.out.println("ok2");
        } else {
            System.out.println("4<5 nie ok");
        }
        if ((2 - 2) == 0) {
            System.out.println("ok3");
        }
        if (true) {
            System.out.println("ok4");
        }
        if (9 % 2 == 0) {
            System.out.println("ok5");
        }
        if (9 % 3 == 0) {
            System.out.println("ok6");
        }
        System.out.println(9 % 3);
        System.out.println(10 % 3);

        boolean zmienna = true;


        // Switch
        int zmienna1 = 3;
        switch (zmienna1) {
            case 1: {
                System.out.println("Jeden");
                break;
            }
            case 2: {
                System.out.println("Dwa");
                break;
            }
            default: {
                System.out.println("Default");
                break;
            }
        }

        // Podstawowe we/wy
        String imie;
        System.out.print("Witaj! Podaj swoje imię.");
        Scanner odczyt1 = new Scanner(System.in);
        imie = odczyt1.nextLine();
        System.out.println("Witaj " + imie);

        final int szukanaLiczba;
        int wpisanaLiczba;
        boolean wyjscie = false;
        szukanaLiczba = (int) (Math.random() * 100);
        while (!wyjscie) {
            System.out.println(imie + " wpisz liczbę o której pomślałem!");
            Scanner odczyt = new Scanner(System.in);
            wpisanaLiczba = odczyt.nextInt();
            if (wpisanaLiczba > szukanaLiczba) {
                System.out.println("Szukana liczba jest mniejsza od Twojej!");
            }
            if (wpisanaLiczba < szukanaLiczba) {
                System.out.println("Szukana liczba jest większa od Twojej!");
            }
            if (wpisanaLiczba == szukanaLiczba) {
                System.out.println("Zgadłeś! Brawo! Ta liczba to " + wpisanaLiczba);
                wyjscie = true;
            }
        }
    }
}
