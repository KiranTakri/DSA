package Array;

import java.util.Scanner;

public class BinarySortedArray {
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
        int[] arr2=sortedArray(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
    static int[] sortedArray(int[] arr){
        int zeroes=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<zeroes){
                arr[i]=0;
            }else {
                arr[i]=1;
            }
        }
        return arr;
    }
}
