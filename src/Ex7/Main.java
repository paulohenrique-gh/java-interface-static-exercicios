package Ex7;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        makeSound(dog);
        makeSound(cat);
    }

    public static void makeSound(Speakable speakable) {
        speakable.speak();
    }
}
