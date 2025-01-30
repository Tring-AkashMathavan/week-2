package Exceptions.Custom;

import java.util.Scanner;

public class CustomException{

    static Scanner in = new Scanner(System.in);

    public static int operation(int a , int b , char symbol) throws ArithmeticException, InvalidOperationException {
        return switch (symbol) {
            case '+' -> a + b;
            case '-' -> (a > b) ? (a - b) : (b - a);
            case '*' -> a * b;
            case '/' -> Divide(a, b);
            default -> throw new InvalidOperationException("Symbols not valid");
        };
    }

    public static int Divide(int a , int b) throws ArithmeticException{
        try {
            return a / b;
        }catch (ArithmeticException e){
            throw new ArithmeticException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try{
            System.out.println("Enter Valid Symbols : [+ , - , / , *] ");
            char value = in.next().charAt(0);
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(operation(a , b , value));
        } catch (InvalidOperationException e) {
            throw new RuntimeException(e);
        }
    }
}
