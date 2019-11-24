public abstract class Shape {
    protected String lineColor;

    public Shape(String lineColor) {
        this.lineColor = lineColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    abstract public double getArea();
}
