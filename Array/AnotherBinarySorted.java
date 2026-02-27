package Array;

import java.util.Scanner;

public class AnotherBinarySorted {
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
        int[] nums=sortedArrar(arr);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    static int[] sortedArrar(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                i--;
            }
            if(arr[i]==0){
                i++;
            }
            if (arr[j]==1){
                j--;
            }
        }
        return arr;
    }
}
