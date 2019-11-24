package com.company.helloworld.kalkular;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class ZadanieLatwe5 {
    public static void main(String[] args) {
        int opcja;
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Opcja A");
        System.out.println("2.Opcja B");
        System.out.println("3.Opcja C");
        opcja = scan.nextInt();
        switch (opcja) {
            case 1:
                System.out.println("Wybrałeś opcję 1");
                break;
            case 2:
                System.out.println("Wybrałeś opcję 2");
                break;
            case 3:
                System.out.println("Wybrałeś opcję 3");
                break;
            default:
                System.out.println("Błędny wybór");
        }


    }
}
