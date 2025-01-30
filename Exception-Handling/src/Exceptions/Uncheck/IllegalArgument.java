package Exceptions.Uncheck;

public class IllegalArgument {

    public static void setNumber(int number){
        if(number <= 0){
            throw new IllegalArgumentException("Number must be positive");
        }
        System.out.println("Number is : " + number);
    }

    public static void main(String[] args) {

        try {
            setNumber(-6);
        }catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
}
