package SortingPractice;

public class InsertionSort {
    public static void main(String[] args) {
            int[] arr={34,5,7,1,2,33,0,-90};
            for (int ele:sortingArray(arr)){
                System.out.print(ele+" ");
            }
    }
    static int[] sortingArray(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int swap=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=swap;
                j--;
            }
        }
        return arr;
    }
}
