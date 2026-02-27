package Array;

import java.util.Scanner;

public class tripletSum {
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
        System.out.println("Please enter the number to check the sum of the pair");
        int num=sc.nextInt();
        sumTriplet(arr,num);
    }

    static void sumTriplet(int[] arr,int num){
        int ans=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if(arr[i]+arr[j]+arr[k]==num){
                        ans++;
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                }

            }

        }
        System.out.println(ans);
    }
}
