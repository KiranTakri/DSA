package PracticeArray;

import java.util.Scanner;

public class ArrayInitialization {
    static void PrintArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[7];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element into the array "+i);
            array[i]=sc.nextInt();

        }
        PrintArray(array);

    }
}
