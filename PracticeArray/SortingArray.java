package PracticeArray;

public class SortingArray {
    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        PrintArray(arr);
        int[] sortArray=sorting(arr);
        System.out.println();
        PrintArray(sortArray);

    }
    static int[] sorting(int[] arr){
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
