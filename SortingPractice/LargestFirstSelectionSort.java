package SortingPractice;

public class LargestFirstSelectionSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,8,9,0,4,5,1};
        System.out.println(maxNubFirst(arr));
    }
    static int maxNubFirst(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                if(arr[j]>max){
                    max=arr[j];
                }
            }

        }
        return max;
    }
}
