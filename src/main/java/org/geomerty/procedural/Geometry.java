package org.geomerty.procedural;

import org.geomerty.procedural.shapes.*;

import static java.lang.Math.PI;

public class Geometry {
    public static double area(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return s.side * s.side;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return r.height * r.width;
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return PI * c.radius * c.radius;
        } else if (shape instanceof  Triangle) {
            Triangle t = (Triangle) shape;
            return 0.5 * t.base * t.height;
        }
        throw new NoSuchShapeException();
    }

    public static double perimeter(Object shape) throws NoSuchShapeException {
        if (shape instanceof Square) {
            Square s = (Square) shape;
            return 4 * s.side;
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            return 2 * (r.height + r.width);
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            return 2 * PI * c.radius;
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            double hypotenuse = Math.sqrt((t.base * t.base) + (t.height * t.height));
            return t.base + t.height + hypotenuse;
        }
        throw new NoSuchShapeException();
    }

    public static void main(String[] args) throws NoSuchShapeException {
        Square square = new Square();
        Point squareTopLeftPoint = new Point();
        squareTopLeftPoint.x = 2.5;
        squareTopLeftPoint.y = 4.5;
        square.topLeft = squareTopLeftPoint;
        square.side = 3.0;
        System.out.println("Area of square is " + area(square));
        System.out.println("Perimeter of square is " + perimeter(square));

        Rectangle rectangle = new Rectangle();
        Point rectangleTopLeftPoint = new Point();
        rectangleTopLeftPoint.x = 10.0;
        rectangleTopLeftPoint.y = 5.0;
        rectangle.topLeft = rectangleTopLeftPoint;
        rectangle.height = 4.0;
        rectangle.width = 5.0;
        System.out.println("Area of rectangle is " + area(rectangle));
        System.out.println("Perimeter of rectangle is " + perimeter(rectangle));

        Circle circle = new Circle();
        Point circleCenter = new Point();
        circleCenter.x = 8.7;
        circleCenter.y = 4.0;
        circle.center = circleCenter;
        circle.radius = 6.3;
        System.out.println("Area of circle is " + area(circle));
        System.out.println("Perimeter of circle is " + perimeter(circle));

        Triangle triangle = new Triangle();
        triangle.base = 10.0;
        triangle.height = 5.0;
        System.out.println("Area of triangle is " + area(triangle));
        System.out.println("Perimeter of triangle is " + perimeter(triangle));
    }
}
