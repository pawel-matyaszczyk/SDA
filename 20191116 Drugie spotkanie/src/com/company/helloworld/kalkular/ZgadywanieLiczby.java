package com.company.helloworld.kalkular;

import sun.org.mozilla.javascript.internal.ast.WhileLoop;

import java.util.Scanner;

public class ZgadywanieLiczby {
    public static void main(String[] args) {
        final int numberToGuess = 77;
        int userGuess;
        Scanner scan = new Scanner(System.in);
        int healthPoint = 5;

        while (healthPoint>0){

            userGuess = scan.nextInt();
            System.out.println("Wpisałeś liczbę: " + userGuess);

            if (userGuess==numberToGuess){
                System.out.println("Wygrałeś");
                return;
            }
            if (userGuess>numberToGuess){
                System.out.println("Liczba jest za duża");
            }else{
                System.out.println("Liczba jest za mała");
            }
            healthPoint--;
            System.out.println("Pozostało Tobie " + healthPoint + " punktów życia.");
        }
    }
}
