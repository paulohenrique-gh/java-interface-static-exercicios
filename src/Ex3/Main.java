package Ex3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Square example: ");
        System.out.println("Side length: 4");
        System.out.println("Area: " + Geometry.calculateSquareArea(4));
        System.out.println("==========");

        System.out.println("Rectangle example: ");
        System.out.println("Width: 5");
        System.out.println("Height: 5");
        System.out.println("Area: " + Geometry.calculateRectangleArea(5, 5));
        System.out.println("==========");


        System.out.println("Triangle example: ");
        System.out.println("Base: 35");
        System.out.println("Height: 30");
        System.out.println("Area: " + Geometry.calculateTriangleArea(35, 30));
        System.out.println("==========");

        System.out.println("Circle example: ");
        
    }
}
