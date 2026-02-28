package PracticeArray;

public class SumElement {
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        System.out.println(sumElement(arr));
    }
    static int sumElement(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;
    }
}
