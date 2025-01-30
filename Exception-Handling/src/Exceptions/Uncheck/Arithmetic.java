package Exceptions.Uncheck;

public class Arithmetic {
    public static void main(String[] args) {
        int n = 10;
        int d = 0;

        try {
            int result = n / d;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }finally {
            System.out.println("Program End...");
        }

        System.out.println("Program continues after exception handling.");
    }
}
