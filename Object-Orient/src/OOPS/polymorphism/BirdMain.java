package OOPS.polymorphism;

public class BirdMain {
    public static void main(String[] args) {
        Bird bird = new Bird();

        //Upcasting
        Bird birds = new Sparrow();

        bird.eat();
        bird.fly();

        birds.eat();
        birds.fly();

        //Downcast
        Sparrow sparrow = (Sparrow) birds;
        sparrow.eat();
        sparrow.fly();

    }
}
