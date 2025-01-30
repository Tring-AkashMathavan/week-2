package OOPS.Classes;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.CarDetails();

        Car benz = new Car("Benz" , "Black" , "20,00,000");
        benz.Start();
        benz.Stop();
        benz.CarDetails();
    }
}
