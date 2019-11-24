package com.company.helloworld.kalkular;

public class Zadanie1 {
    public static void main(String[] args) {
        int timeToBum = 5;
        while (timeToBum>0){
            System.out.println("Bomba wybuchnie za "+timeToBum);
            timeToBum--;
        }
        if (timeToBum ==0) {
            System.out.println("BuuM!)");
        }
    }
}
