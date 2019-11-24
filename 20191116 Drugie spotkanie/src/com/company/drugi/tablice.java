package com.company.drugi;

public class tablice {
    public static void main(String[] args) {
        String[] pasazerowie;
        pasazerowie = new String[4];
        String[] osobyWPociagu = new String[]{"Janusz", "Mariusz", "Juliusz"};
        for (int i =0; i<pasazerowie.length;i++)  {
            pasazerowie[i] = "Nowa osoba " + i;
            System.out.println(pasazerowie[i]);
        }

        for (String x:osobyWPociagu){
            System.out.println("Osoba w pociągu: " +x);
        }
    }
}
