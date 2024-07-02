package Ex3;

public class Geometry {
    public static double calculateSquareArea(double side) {
       return side * side;
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static double calculateTriangleArea(double base, double height) {
        return base * height / 2;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCubeArea(double side) {
        return Math.pow(side, 3);
    }

    public static double calculateParallelepipedArea(double length, double width, double height) {
        return 2 * ((length * width) + (length * height) + (width * height));
    }

    public static double calculateTrapezoidArea(double base1, double base2, double height) {
        return (base1 + base2) * height / 2;
    }

    public static double calculateSphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 3) / 3;
    }
}
