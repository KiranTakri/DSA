package PracticeArray;

public class sorting {
    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        PrintArray(arr);
        System.out.println();
        int[] arr2=sortingArray(arr);
        PrintArray(arr2);
    }
    static int[] sortingArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        return arr;
    }
}
