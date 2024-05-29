package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Rectangle rectangle = new Rectangle(2, 4);
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(2, 4);

        // Shape shape = new Shape(); // geht nicht mehr, da es jetzt eine abstrake Klasse ist

        output(Double.toString(rectangle.area()));
        output(Double.toString(circle.area()));
        output("The Area of the circle is " + circle.area());
        output(Double.toString(triangle.area()));

        output("Diff. r-c: " + areaDiff(rectangle, circle));
        output("Diff. r-c: " + areaDiff(rectangle, triangle));
        output("Diff. r-c: " + areaDiff(circle, circle));

    }
    
    // 1. Iteration ggf x1000 überladen ...
    // private static double areaDiff(Rectangle r, Triangle t) {
    //     return r.area() - t.area();
    // }

    private static double areaDiff(Shape s1, Shape s2) { // 2. Iteration Polymorphie genutzt
        return s1.area() - s2.area();
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

