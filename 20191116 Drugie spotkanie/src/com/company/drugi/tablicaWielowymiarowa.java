package com.company.drugi;

public class tablicaWielowymiarowa {
    public static void main(String[] args) {
        int[][] tablica = new int[5][5];
        for (int i = 0; i<tablica.length; i++){
                for (int j = 0; j< tablica[0].length;j++){
                    if (i==2){
                        tablica[i][j] = 1;
                    }else {
                        tablica[i][j] = 0;
                    }
                }
            System.out.println();
            }
        for(int i =0; i<tablica.length; i++){
                for (int j = 0; j< tablica[0].length;j++){
                    System.out.print(tablica[i][j]+ " ");
                }
            System.out.println();

            }

        int[][] tablica2 = new int[5][5];

//        for (int i = 0; i<tablica2.length; i++){
//                for (int j = 0; j< tablica2[0].length;j++){
//                    if (i==j){
//                        tablica2[i][j] = i;
//                    }else {
//                        tablica2[i][j] = 0;
//                    }
//                }
//            System.out.println();
//            }
//
        for (int i = 0; i < tablica2.length; i++) {
            tablica2[i][i]=i;
        }
        for(int i =0; i<tablica2.length; i++){
                for (int j = 0; j< tablica2[0].length;j++){
                    System.out.print(tablica2[i][j]+ " ");
                }
            System.out.println();

            }
    }
}
