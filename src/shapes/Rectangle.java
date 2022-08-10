package shapes;

import util.Input;

import java.util.Scanner;

public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public static void main(String[] args) {

    }
}
