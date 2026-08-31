package InterfaceEsimerkki;

public class InterfaceExample {
    private static void feedAnimal(Animal animal) {
        animal.eat();
        animal.sleep();
    }

    public static void main(String[] args) {
        // Using the feedAnimal method (polymorphism)
        feedAnimal(new Dog()); // Output: Dog is eating. Dog is sleeping.
        feedAnimal(new Cat()); // Output: Cat is eating. Cat is sleeping.
        feedAnimal(new Mouse());
    }
}