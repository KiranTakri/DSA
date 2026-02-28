package PracticeArray;

import java.util.Scanner;

public class ArrayInitiaze {
    static int[] utility(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Please enter the element into the array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element no "+" "+i);
            arr[i]=sc.nextInt();

        }
        return arr;
    }
}
