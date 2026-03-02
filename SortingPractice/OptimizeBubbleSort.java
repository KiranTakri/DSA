package SortingPractice;

public class OptimizeBubbleSort {
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5,6,7,0,-4,-3};
        int[] arr2=sortedArray(arr);
        for (int ele:arr2){
            System.out.print(ele+" ");
        }
    }
    static int[] sortedArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int count=0;
            for (int j = 0; j < arr.length-1-i; j++) {
                int swap=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=swap;
                count++;
            }
            if(count==0){
                break;
            }
        }
        return arr;
    }
}
