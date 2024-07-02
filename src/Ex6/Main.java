package Ex6;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        Image image = new Image();

        printMessage(document);
        printMessage(image);
    }

    public static void printMessage(Printable printable) {
        printable.print();
    }
}
