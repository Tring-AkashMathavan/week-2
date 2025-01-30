package OOPS.Inheritance.SingleLevel;

public class Dog extends Animal{

    Dog(String animal , String placeToLive){
        super(animal , placeToLive);
    }

    public void bark() {
        System.out.println(this.animal + " is Barking...");
    }

}
