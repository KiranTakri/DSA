package Array;

import java.util.Scanner;

public class SmallestAndLargesteElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Please enter the element into the array");
        for (int i=0;i<size;i++){
            System.out.println("Element no "+i);
            arr[i]=sc.nextInt();
        }

        int[] arr2=maxminArray(arr);
        System.out.print("[ ");
        for (int  i= 0;  i< arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println("]");
    }
    static int largest(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }

        }
        return max;
    }
    static int smallest(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }

        }
        return min;
    }
    static int[] maxminArray(int[] arr){
        int[] arr2={largest(arr),smallest(arr)};


        return arr2;
    }


}
