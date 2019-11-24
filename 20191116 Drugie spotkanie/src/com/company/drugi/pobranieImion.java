package com.company.drugi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pobranieImion {
    public static void main(String[] args) {
        String[] firstNames;
        String addedName;
        Scanner scan = new Scanner(System.in);
        Scanner names = new Scanner(System.in);
        int howManyNames;

        System.out.println("Ile chcesz podać imion?");
        howManyNames = names.nextInt();
        firstNames = new String[howManyNames];


        System.out.println("Podaj imiona osób.");
        for (int i = 0; i < firstNames.length; i++) {
            System.out.println("Podaj imię osoby nr " + (i + 1));
            addedName = scan.nextLine();
            firstNames[i] = addedName;
        }
        System.out.println("Wyświetlenie z funkcją for: ");
        for (String x : firstNames) {
            System.out.println("Witaj " + x);
        }
        int c = 0;

        System.out.println("Wyświetlenie z funkcją while: ");
        while (c < firstNames.length)
        {
            System.out.println("Witaj " + firstNames[c]);
            c++;
        }

        Integer[] tableWithNumbers;
        tableWithNumbers = new Integer[]{1,3,5,10};
        System.out.println("Nowa tablica o {1,2,5,10}: ");

        System.out.println("Wypisanie elementów w pętli: ");
        for(int x:tableWithNumbers){
            System.out.print(x + " ");
        }

        System.out.println("Wypisanie elementów o parzystym indeksie");
        for (int i = 0; i<tableWithNumbers.length;i++){
          if (i%2 == 0){
              System.out.println("Element " + i + " wartość " +tableWithNumbers[i].toString());
          }
        }

        System.out.println("Wypisanie liczby parzyste");
        for (int i = 0; i<tableWithNumbers.length;i++){
            if (tableWithNumbers[i]%2 == 0){
                System.out.println("Element " + i + " wartość " +tableWithNumbers[i].toString());
            }
        }

        System.out.println("Wypisanie w odwróconej kolejności: ");
        for (int i = tableWithNumbers.length-1; i>=0; i--){
        System.out.println("Element " + i + " wartość " +tableWithNumbers[i].toString());
        }

    }



    }
