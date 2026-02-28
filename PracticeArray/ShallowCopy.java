package PracticeArray;

import java.util.Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        int[] arr2= Arrays.copyOf(arr,arr.length);
        arr2[3]=1;
        System.out.println(arr[3]);
        System.out.println(arr2[3]);
    }
}
