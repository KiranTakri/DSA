package Array;

import java.util.Scanner;

public class indicesSumOfArray {
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
        System.out.println(sumArray(arr,l,q));
    }
    static int sumArray(int[] array,int l,int q){
        int sum=0;
        for(int i=l;i<=q;i++){
            sum+=array[i];
        }
        return sum;
    }
}
