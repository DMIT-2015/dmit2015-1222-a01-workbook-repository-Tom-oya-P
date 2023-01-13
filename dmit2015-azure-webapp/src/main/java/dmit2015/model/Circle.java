package dmit2015.model;

import java.io.PrintStream;

public class Circle {

    // Field
    private double radius;

    // Getter Property
    public double getRadius() {
        return radius;
    }

//    // Checked Exception Example (Setter Property)
//    public void setRadius(double radius) throws Exception {
//        if(radius <= 0){
//            throw new Exception("Radius must be a positive non-zero number.");
//        }
//        this.radius = radius;
//    }

    // Runtime Exception Example (Setter Property)
    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Radius must be a positive non-zero number.");
        }
        this.radius = radius;
    }

    // Default Constructor
    public Circle(){
        setRadius(1);
    }
    // Overloaded Constructor
    public Circle(double radius) {
        // this.radius = radius;
        setRadius(radius);
    }

    // Method
    public double Area(){
        return Math.PI * radius * radius;
    }

    public double Perimeter(){
        return 2 * Math.PI * radius;
    }

    public void main(String[] args){
        // Create a Circle with a radius of 1
        Circle circle1 = new Circle();
        // The radius of circle1 should be 1,
        // area should be 3.14
        // perim should be 6.2
        System.out.printf("Radius of circle1 is %s", circle1.getRadius());
        System.out.printf("Area of circle1 is %.5f", circle1.Area());
        System.out.printf("Perimeter of circle1 is %.2f", circle1.Perimeter());

        // printf = print w/ changing format (similar to C# ${})
        System.out.printf("Radius of circle1 is %s", circle1.getRadius());
        System.out.printf("Area of circle1 is %.5f", circle1.Area());
        System.out.printf("Perimeter of circle1 is %.2f", circle1.Perimeter());

        try{
            circle1.setRadius(25);
            System.out.printf("New radius of circle1 is %s", circle1.getRadius());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
