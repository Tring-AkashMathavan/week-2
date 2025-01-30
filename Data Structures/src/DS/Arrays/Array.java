package DS.Arrays;

import java.util.Scanner;

public class Array {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the size of the array : ");
        int size = in.nextInt();

        int[] arr = new int[size];

        FillArray(arr , size);

        Traversal(arr);
        System.out.println(Search(arr));

    }


    public static void FillArray(int[] arr , int size){
        System.out.println("Enter the values : ");
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        System.out.println();
    }

    public static int Search(int[] arr){

        System.out.println("Enter the target : ");
        int target = in.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void Traversal(int[] arr){

        for(int value : arr){
            System.out.print(value + " ");
        }
    }
}
