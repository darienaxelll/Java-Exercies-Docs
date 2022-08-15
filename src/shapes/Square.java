package shapes;

public class Square extends Quadrilateral{
    public Square(double length, double width) {
        super(length, width);
    }

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.length = this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    public static void main(String[] args) {

    }
}
