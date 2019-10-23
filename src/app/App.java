package app;

import app.prototypes.concretes.Circle;
import app.prototypes.concretes.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle();

        rectangle.setX(4);
        rectangle.setY(18);
        rectangle.setColor("black");
        rectangle.setHeight(10);
        rectangle.setWidth(15);

        Rectangle copiedRectangle = rectangle.clone();

        if (copiedRectangle == rectangle) {
            System.out.println("Son idénticos 'misma referencia'");
        } else {
            System.out.println("No son idénticos 'no es la misma referencia al objeto'");
            System.out.println(rectangle + " " + copiedRectangle);
        }

        Circle circle = new Circle();
        
        circle.setRadius(15);
        circle.setColor("Red");

        Circle copiedCircle = circle.clone();
        System.out.println(copiedCircle);
    }
}