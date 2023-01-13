package dmit2015.model;

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

    // Constructor
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
}
