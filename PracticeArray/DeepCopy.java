package PracticeArray;

public class DeepCopy {
    public static void main(String[] args) {
        int[] arr= ArrayInitiaze.utility();
        int[] arr2=arr;
        arr2[3]=100;
        System.out.println(arr[3]);
        System.out.println(arr2[3]);
    }
}
