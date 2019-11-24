package com.company.helloworld.kalkular;

import java.util.Scanner;

public class ZadanieLatwe4 {
    public static void main(String[] args) {
        String slowo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj słowo: ");
        slowo = scan.next();
        long start = System.nanoTime();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " : " + slowo);
            }
        }
        long elapsedTime1 = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i <= 100 ; i+=2) {
            System.out.println(i + " : " + slowo);
        }
        long elapsedTime2 = System.nanoTime() - start;
        System.out.println("Czas uruchomienia 1: "+elapsedTime1);
        System.out.println("Czas uruchomienia 2: "+elapsedTime2);

    }
}
