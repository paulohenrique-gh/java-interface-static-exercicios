package Ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Square example: ");
        System.out.println("Side length: 4");
        System.out.println("Area: " + Geometry.calculateSquareArea(4));
        System.out.println("==========");

        System.out.println("Rectangle example: ");
        System.out.println("Width: 5");
        System.out.println("Height: 8");
        System.out.println("Area: " + Geometry.calculateRectangleArea(5, 8));
        System.out.println("==========");

        System.out.println("Triangle example: ");
        System.out.println("Base: 35");
        System.out.println("Height: 30");
        System.out.println("Area: " + Geometry.calculateTriangleArea(35, 30));
        System.out.println("==========");

        System.out.println("Circle example: ");
        System.out.println("Radius: 12");
        System.out.println("Area: " + Geometry.calculateCircleArea(12));
        System.out.println("==========");

        System.out.println("Cube example: ");
        System.out.println("Side length: 9");
        System.out.println("Area: " + Geometry.calculateCubeArea(9));
        System.out.println("==========");

        System.out.println("Parallelepiped example: ");
        System.out.println("Length: 12");
        System.out.println("Width: 30");
        System.out.println("Height: 26");
        System.out.println("Area: " + Geometry.calculateParallelepipedArea(12, 30, 26));
        System.out.println("==========");

        System.out.println("Trapezoid example: ");
        System.out.println("Base 1: 6");
        System.out.println("Base 2: 9");
        System.out.println("Height: 12");
        System.out.println("Area: " + Geometry.calculateTrapezoidArea(6, 9, 12));
        System.out.println("==========");

        System.out.println("Sphere example: ");
        System.out.println("Radius: 13");
        System.out.println("Area: " + Geometry.calculateSphereArea(13));
        System.out.println("==========");
    }
}
