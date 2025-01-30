package OOPS.Inheritance.SingleLevel;

public class Animal {

    String animal;
    String placeToLive;

    public Animal(){
        this.animal = "Lion";
        this.placeToLive = "Forest";
    }

    public Animal(String animal , String placeToLive){
        this.animal = animal;
        this.placeToLive = placeToLive;
    }

    public void sound(){
        System.out.println("Animals make different sounds");
    }

    public void eat(){
        System.out.println(this.animal + " is Eating...");
    }

    public void walk(){
        System.out.println(this.animal + " is  Walking...");
    }
}
