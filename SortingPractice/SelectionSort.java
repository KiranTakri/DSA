package SortingPractice;

public class SelectionSort {
    public static void print(int[] arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={98,2,-3,65,74,3,2,0,-67};
        int[] arr2=sortingArray(arr);
        print(arr2);
    }
    public static int[] sortingArray(int[] arr){
        int n= arr.length;
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
