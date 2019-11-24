package com.company.helloworld.kalkular;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Cwiczenie1 {
    public static void main(String[] args) {
        double a = 3;
        double b = 2;
        double c = 4;
        Object[] dane = {a,b,c};
        System.out.println((a+b)*c);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(Arrays.toString(dane));

        byte sto = 100;
        byte dwa = 2;
        short wynik;
        wynik = (short)(sto+dwa);
        System.out.println(wynik);

        int liczbaInt = 10;
        short liczbaShort = 10;
        long liczbaLong = 1000000000;
        char znakChar = 'a';
        float liczbaFloat = 13.65f;
        double liczbaDouble = 13.3333333333333333333d;

        liczbaInt = (int)liczbaLong;
        System.out.println(liczbaInt);
        liczbaInt = (int)znakChar;
        System.out.println(liczbaInt);
        for (int i=0;i<1000;i++){
            System.out.print((char)i);
        }
        System.out.print((char)liczbaInt);

    }

}

