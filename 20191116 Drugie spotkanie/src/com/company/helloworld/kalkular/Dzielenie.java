package com.company.helloworld.kalkular;

public class Dzielenie {
    static double a = 3;
    static double b = 7;

    public static void main(String[] args) {
        if (a > 0) {
            double c = b / a;
            System.out.println(String.format("%.3f",c));
        } else {
            System.out.println("Nie można dzielić przez 0");
        }
    }
}
