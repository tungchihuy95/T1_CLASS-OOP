package Phuongtrinhbac2;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
          return (this.b * this.b - 4 * this.a * this.c);

    }

    public double getRoot1() {
        return (-this.b + Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5))/(2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow((this.b * this.b - 4 * this.a * this.c), 0.5))/(2 * this.a);
    }

    public double getRoot3() {
        return (-this.b/(2 * this.a));
    }



}
