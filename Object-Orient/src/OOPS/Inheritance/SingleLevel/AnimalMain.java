package OOPS.Inheritance.SingleLevel;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.sound();
        animal.eat();
        animal.walk();


        Animal animal1 = new Animal("Cat" , "Home");

        animal1.sound();
        animal1.eat();
        animal1.walk();


        Dog dog = new Dog("Dog" , "Home");

        dog.eat();
        dog.walk();
        dog.bark();

    }
}
