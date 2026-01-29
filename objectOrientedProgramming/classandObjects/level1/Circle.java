package objectOrientedProgramming.classandObjects.level1;

/*
 Program to calculate area and circumference of a circle
*/
class Circle {

    // instance variable
    double radius;

    // constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // method to display results
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }

    // main method
    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.display();
    }
}
