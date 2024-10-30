import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(23.5, "red", true );
        System.out.println(square);
        System.out.println(square.side);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 6, "black", true );
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(50, "blue", false );
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Shape shape = new Shape("orange", true );
        System.out.println(shape);
    }
}