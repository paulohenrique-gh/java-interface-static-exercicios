package Ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Current count: " + Counter.getCount());

        System.out.println("Creating new instance...");
        new Counter();
        System.out.println("Current count: " + Counter.getCount());
        System.out.println("One more...");
        new Counter();
        System.out.println("Current count: " + Counter.getCount());
    }
}
