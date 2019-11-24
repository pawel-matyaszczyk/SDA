

public class Main {
    public static void main(String[] args) {
        //pojazd();
        //firma();
        Shape circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getLineColor());

        Shape circle2 = new Circle("Czerwony",5);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getLineColor());

        Shape rectangle = new Rectangle("niebieski",5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getLineColor());

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
