package Exceptions.Uncheck;

public class NullPointer extends Throwable {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        String str = null;

        try{
            System.out.println(arr[5]);
            System.out.println("String is Null");

        }catch (NullPointerException e){
            System.err.println("Array is null ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        } catch (Exception e){
            System.err.println("Array Is Null " + e.getMessage());
        }

    }
}
