package com.company.drugi;

import javax.sound.midi.Soundbank;

public class Pojazd {
    final static int DEFAULT_CAR_WHEEL_NUMBER = 4;

    private int liczbaKol;
    private String kolor;

    public String getKolor() {
        return kolor;
    }

    public Integer getLiczbaKol() {
        return liczbaKol;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setPojazd(int liczbaKol, String kolor) {
        this.liczbaKol = liczbaKol;
        this.kolor = kolor;
    }

    public Pojazd() {
        liczbaKol = DEFAULT_CAR_WHEEL_NUMBER;
    }

    public static void main(String[] args) {
        Pojazd pojazd = new Pojazd();
        pojazd.setKolor("Zielony");
        Pojazd audi = new Pojazd();
        audi.setKolor("Srebrny");
        Pojazd mercedes = new Pojazd();
        mercedes.setPojazd(7,"Czerwony");

        System.out.println(pojazd.getKolor());
        System.out.println(audi.getKolor());
        System.out.println(mercedes.getKolor()+ " " + mercedes.getLiczbaKol());
    }
}
