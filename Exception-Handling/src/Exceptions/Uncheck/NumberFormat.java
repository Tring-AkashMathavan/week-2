package Exceptions.Uncheck;

public class NumberFormat {
    public static void main(String[] args) {
        String str = "123 4";
        try{
            System.out.println(Integer.parseInt(str));
        }catch (NumberFormatException e){
            System.out.println("Number is invalid " + e.getMessage());
        }
    }
}
