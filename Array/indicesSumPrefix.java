package Array;

import java.util.Scanner;

public class indicesSumPrefix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for (int i=1;i<size;i++){
            System.out.println("Enter the element "+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the start indices");
        int l=sc.nextInt();
        System.out.println("Enter the last indices");
        int q=sc.nextInt();
        System.out.println(indicesSum(arr,l,q));
    }
    static int[] sumPrefix(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        return arr;
    }
    static int indicesSum(int[] arr,int l,int r){
        int[] prefix=sumPrefix(arr);
        int sum=prefix[r]-prefix[l-1];
        return sum;
    }
}
