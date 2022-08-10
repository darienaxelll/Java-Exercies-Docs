package shapes;

import java.lang.Math;

public class Square extends Rectangle{
    protected int side;

    public Square(int length, int width, int side) {
        super(length, width);
        this.side = side;
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }

    public static void main(String[] args) {

    }
}
