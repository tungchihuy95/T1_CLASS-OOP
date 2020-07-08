package Phuongtrinhbac2;

import RectangleClass.Rectangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap b:");
        double b = scanner.nextDouble();
        System.out.println("Nhap c:");
        double c = scanner.nextDouble();
        //System.out.println("Delta la:");
        //double delta = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Nghiem 1 cua phuong trinh la:" + quadraticEquation.getRoot1());
            System.out.println("Nghiem 2 cua phuong trinh la:" + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co 1 nghiem la:" + quadraticEquation.getRoot3());
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
