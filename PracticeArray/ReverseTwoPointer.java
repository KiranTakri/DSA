package PracticeArray;

public class ReverseTwoPointer {
    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        PrintArray(arr);
        System.out.println();
        int[] reverseArr=reverseArray(arr);
        PrintArray(reverseArr);

    }
    static int[] reverseArray(int[] arr){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;
        }
        return arr;
    }
}
