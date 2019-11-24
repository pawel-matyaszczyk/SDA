public class Pojazd {
    private int liczbaKol;
    private String kolor;
    private float predkosc;

    public Pojazd() {
    }

    public Pojazd(int liczbaKol, String kolor, int predkosc) {
        this.liczbaKol = liczbaKol;
        this.kolor = kolor;
        this.predkosc = predkosc;
    }

    public Pojazd(int liczbaKol, String kolor) {
        this.liczbaKol = liczbaKol;
        this.kolor = kolor;
        this.predkosc = 100;
    }

    public void setLiczbaKol(int liczbaKol) {
        this.liczbaKol = liczbaKol;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setPredkosc(float predkosc) {
        this.predkosc = predkosc;
    }

    public int getLiczbaKol() {
        return liczbaKol;
    }

    public String getKolor() {
        return kolor;
    }

    public float getPredkosc() {
        return predkosc;
    }

    @Override
    public String toString() {
        return "Pojazd ma " + liczbaKol +
                " koła, jest " + kolor +
                " i może jechać " + predkosc +
                "km/h.";
    }
}
