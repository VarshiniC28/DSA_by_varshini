package math.programs;

import java.util.Scanner;

public class AreaPerimeterVolume {


    // ---------------- AREA PROGRAMS ----------------
    static void areaOfCircle(Scanner sc) {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }

    static void areaOfTriangle(Scanner sc) {
        System.out.print("Enter base and height: ");
        double b = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }

    static void areaOfRectangle(Scanner sc) {
        System.out.print("Enter length and width: ");
        double l = sc.nextDouble(), w = sc.nextDouble();
        System.out.println("Area of Rectangle = " + (l * w));
    }

    static void areaOfIsoscelesTriangle(Scanner sc) {
        System.out.print("Enter base and side: ");
        double b = sc.nextDouble(), a = sc.nextDouble();
        double h = Math.sqrt(a * a - (b * b) / 4.0);
        System.out.println("Area of Isosceles Triangle = " + (0.5 * b * h));
    }

    static void areaOfParallelogram(Scanner sc) {
        System.out.print("Enter base and height: ");
        double b = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Area of Parallelogram = " + (b * h));
    }

    static void areaOfRhombus(Scanner sc) {
        System.out.print("Enter diagonals d1 and d2: ");
        double d1 = sc.nextDouble(), d2 = sc.nextDouble();
        System.out.println("Area of Rhombus = " + (0.5 * d1 * d2));
    }

    static void areaOfEquilateralTriangle(Scanner sc) {
        System.out.print("Enter side: ");
        double a = sc.nextDouble();
        System.out.println("Area of Equilateral Triangle = " + ((Math.sqrt(3) / 4) * a * a));
    }

    // ---------------- PERIMETER PROGRAMS ----------------
    static void perimeterOfCircle(Scanner sc) {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Perimeter of Circle = " + (2 * Math.PI * r));
    }

    static void perimeterOfEquilateralTriangle(Scanner sc) {
        System.out.print("Enter side: ");
        double a = sc.nextDouble();
        System.out.println("Perimeter = " + (3 * a));
    }

    static void perimeterOfParallelogram(Scanner sc) {
        System.out.print("Enter base and side: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.println("Perimeter = " + (2 * (a + b)));
    }

    static void perimeterOfRectangle(Scanner sc) {
        System.out.print("Enter length and width: ");
        double l = sc.nextDouble(), w = sc.nextDouble();
        System.out.println("Perimeter = " + (2 * (l + w)));
    }

    static void perimeterOfSquare(Scanner sc) {
        System.out.print("Enter side: ");
        double a = sc.nextDouble();
        System.out.println("Perimeter = " + (4 * a));
    }

    static void perimeterOfRhombus(Scanner sc) {
        System.out.print("Enter side: ");
        double a = sc.nextDouble();
        System.out.println("Perimeter = " + (4 * a));
    }

    // ---------------- VOLUME PROGRAMS ----------------
    static void volumeOfCone(Scanner sc) {
        System.out.print("Enter radius and height: ");
        double r = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Volume of Cone = " + (Math.PI * r * r * h / 3));
    }

    static void volumeOfPrism(Scanner sc) {
        System.out.print("Enter base area and height: ");
        double a = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Volume of Prism = " + (a * h));
    }

    static void volumeOfCylinder(Scanner sc) {
        System.out.print("Enter radius and height: ");
        double r = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Volume of Cylinder = " + (Math.PI * r * r * h));
    }

    static void volumeOfSphere(Scanner sc) {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Volume of Sphere = " + ((4.0 / 3) * Math.PI * r * r * r));
    }

    static void volumeOfPyramid(Scanner sc) {
        System.out.print("Enter base area and height: ");
        double a = sc.nextDouble(), h = sc.nextDouble();
        System.out.println("Volume of Pyramid = " + ((a * h) / 3));
    }
	public static void main(String[] args) {

		
	}

}
