package DemoCircle;

public class DemoCircle {
    public static void main(String[] args) {
        DemoCircle circle1 = new DemoCircle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        DemoCircle circle2 = new DemoCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        DemoCircle circle3 = new DemoCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }

    double radius;
    DemoCircle() {
        radius = 1;
    }

    DemoCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}

