package OOPS.polymorphism;

public class Sparrow extends Bird{

    @Override
    public void fly() {
        System.out.println("Sparrow is flying high in the sky");
    }

    @Override
    public void eat() {
        System.out.println("All sparrows mainly eat seeds");
    }

}
