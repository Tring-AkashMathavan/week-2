package OOPS.polymorphism;

public class MethodOverload {

    public static int method(int a , int b){
        return a + b;
    }

    public static double method(double a){
        return a * 12.3;
    }

    public static void main(String[] args) {
        System.out.println(method(1.0));
        System.out.println(method(10,20));
    }
}
