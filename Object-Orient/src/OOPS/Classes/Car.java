package OOPS.Classes;

public class Car {

    public String carName;
    public String carColor;
    public String carPrice;

    public Car(){
        this.carName = "Audi";
        this.carColor = "White";
        this.carPrice = "10,00,000";
    }

    public Car(String carName , String carColor , String carPrice){
        this.carName = carName;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public void Start(){
        System.out.println(this.carName + " is Starting...");
    }

    public void Stop(){
        System.out.println(this.carName + " is Stopping...");
    }

    public void CarDetails(){
        System.out.println("Car Model : " + this.carName);
        System.out.println("Car Color : " + this.carColor);
        System.out.println("Car Price : " + this.carPrice);
    }
}
