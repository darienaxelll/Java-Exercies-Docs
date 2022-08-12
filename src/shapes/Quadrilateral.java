package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected double length, width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract setLength(double length) {
        this.length = length;
    }

    public abstract setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
