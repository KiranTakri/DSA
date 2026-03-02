package SortingPractice;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={9,4,6,7,-1,10,-4,5,-90,0,-30};
        int[] arr2=sortingArray(arr);
        for (int ele:arr2){
            System.out.print(ele+" ");
        }
    }
    static int[] sortingArray(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }

        }
        return arr;
    }
}
