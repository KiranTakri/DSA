package Array;

import java.util.Scanner;

public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Please enter the element into the array");
        for (int i = 0; i < size; i++) {
            System.out.println("Element no " + i);
            arr[i] = sc.nextInt();
        }
        firstLargest(arr);
        System.out.println(secondLargest(arr));
        
    }

    static void firstLargest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
    }

    static int secondLargest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}