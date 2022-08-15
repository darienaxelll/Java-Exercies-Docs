package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Rectangle(5, 6);
        System.out.println("The area of the rectangle is: " + myShape.getArea());
        System.out.println("The perimeter of the rectangle is: " +myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("The area of the square is: " + myShape.getArea());
        System.out.println("The perimeter of the square is: " + myShape.getPerimeter());

    }
}
