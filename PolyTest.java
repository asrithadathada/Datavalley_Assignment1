class Animal {
    String makeSound() {
        return "Animal makes a sound";
    }
}

class Lion extends Animal {
    String makeSound() {
        return "Lion roars";
    }
}

class Dog extends Animal {
    String makeSound() {
        return "Dog barks";
    }
}

public class PolyTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Lion();
        Animal cat = new Dog();
        System.out.println(animal.makeSound());
        System.out.println(lion.makeSound());
        System.out.println(dog.makeSound());
    }
}
