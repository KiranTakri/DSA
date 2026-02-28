package PracticeArray;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        System.out.println(maxElement(arr));
        System.out.println(secondLargest(arr));
    }
    static int maxElement(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(max==arr[i]){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        return max;
    }
    static int secondLargest(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
