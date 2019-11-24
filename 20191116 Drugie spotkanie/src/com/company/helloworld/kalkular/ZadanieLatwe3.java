package com.company.helloworld.kalkular;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class ZadanieLatwe3 {
    public static void main(String[] args) {
        String slowo;
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj słowo: ");
        slowo = scan.next();
        for (int i = 1; i < 100 +1; i++) {
            System.out.println(i+" : " + slowo);
        }


    }
}
