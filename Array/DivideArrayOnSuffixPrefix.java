package Array;

import java.util.Scanner;

public class DivideArrayOnSuffixPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element "+i);
            arr[i]=sc.nextInt();
        }
        if (prefixSuffix(arr)){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }

    }
    static int sum(int[] arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    static boolean prefixSuffix(int[] arr){
        int totalSum=sum(arr);
        int prefix=0;
        for (int i = 0; i < arr.length; i++) {
            prefix+=arr[i];
            int suffix=totalSum-prefix;
            if(prefix==suffix){
                return true;
            }
        }
        return false;
    }
}
