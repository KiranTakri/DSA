package TimeComplexity;

import java.util.Scanner;

// Remove duplicate element from the given array
public class DuplicateElement {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element into the array "+i);
            array[i]=sc.nextInt();
        }
    }
    static boolean duplicateNo(int[] arr,int n){
        boolean[] flag=new boolean[n];
        for (int i = 0; i < n; i++) {
            int ele=arr[i];
           if(flag[ele]==true){
               return false;
           }else{
               flag[ele]=true;
           }
        }
        return true;
    }
}
