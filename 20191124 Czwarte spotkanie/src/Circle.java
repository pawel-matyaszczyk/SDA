public class Circle extends Shape {
    private double r;

    public Circle(double r) {
        super("Czarny");
        this.r = r;
    }

    public Circle(String lineColor, double r) {
        super(lineColor);
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
