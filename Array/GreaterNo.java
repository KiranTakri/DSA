package Array;

import java.util.Scanner;

public class GreaterNo {
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
        System.out.println("Enter the no to check greater no present in the array");
        int num=sc.nextInt();
        System.out.println(greater(arr,num));

    }
    static int greater(int[] arr,int num){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>num){
                count++;
            }
        }
        return count;
    }

}
