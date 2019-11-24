package com.company.helloworld.kalkular;

import java.util.Scanner;

public class Odejmowanie {
    static int a = 2;
    static int b = 4;
    public static void main(String[] args) {
        while (a>0 && b>0){
            System.out.print("Podaj odejmowaną ");

            System.out.print("Podaj odjemną ");

            int c = b - a;
            System.out.println(String.format("Wynik odejmowania wynosi: %a",c));
        }

    }
}
