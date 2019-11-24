
package com.company.helloworld;

import java.sql.SQLOutput;

public class OperatorLogiczny {
    public static void main(String[] args) {
        String ja = "Slawek";
        String ty = "Slawek";
        System.out.println(Integer.toHexString(ja.hashCode()));
        System.out.println(Integer.toHexString(ty.hashCode()));
        boolean porownanie1 = ja == ty;
        boolean porownanie2 = ja.equals(ty);
        System.out.println(porownanie1);
        System.out.println(porownanie2);

        String ja2 = "Slawek";
        String ty2 = new String("Slawek");
        System.out.println(Integer.toHexString(ja2.hashCode()));
        System.out.println(Integer.toHexString(ty2.hashCode()));
        boolean porownanie3 = ja2 == ty2;
        boolean porownanie4 = ja.equals(ty2);

        System.out.println(porownanie3);
        System.out.println(porownanie4);

        boolean pierwszePorownanie = (3==3)&&(3==4);
        boolean drugiePorownanie = 3!= 5 || 3 ==5;
        boolean trzeciePorownanie = "cos".equals("cos");
        boolean czwrtePorownanie = "cos" == "cos";

        System.out.println("Pierwsze porównanie: " + pierwszePorownanie);
        System.out.println("Drugie porównanie: " + drugiePorownanie);
        System.out.println("Trzecie porównanie: " + trzeciePorownanie);
        System.out.println("Czwarte porównanie: " + czwrtePorownanie);

        System.out.println("(3==3)&&(3==4) -> " + (3==3&&3==4));
        System.out.println("3!= 5 || 3 ==5 -> " + (3!= 5 || 3 ==5));
        System.out.println("\"cos\".equals(\"cos\") -> "+ ("cos".equals("cos")));
        System.out.println("\"cos\" == \"cos\" -> "+("cos" == "cos"));


    }
}
