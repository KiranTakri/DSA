package Array;

import java.util.Scanner;

public class CheckSortArr {
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
        if(isSort(arr)){
            System.out.println("Sorted");
        }else {
            System.out.println("Not sorted");
        }

    }
    static boolean isSort(int[] arr){
        boolean check=true;
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
        return check;
    }


}
