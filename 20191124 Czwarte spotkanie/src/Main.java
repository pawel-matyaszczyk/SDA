

public class Main {
    public static void main(String[] args) {
        //pojazd();
        firma();
    }

    private static void pojazd() {
        Pojazd car = new Pojazd(4,"czerwony",200);
        Pojazd car2 = new Pojazd(4,"zielony");
        System.out.println(car.toString());
        System.out.println(car2.toString());
    }

    private static void firma(){
        Pracownik p1 = new Pracownik("Jarek","Kowalski",32);
        Pracownik p2 = new Pracownik("Marek","Zawadzki",50);
        Pracownik p3 = new Pracownik("Adam","Kwiatkowski",5);
        Pracownik p4 = new Pracownik("Andrzej","Sucholeski",10);

        Firma firma = new Firma("Gimp sp. z o.o.",p1,p2, p3, p4);
        System.out.println(firma);
    }
}
