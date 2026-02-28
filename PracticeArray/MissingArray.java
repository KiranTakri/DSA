package PracticeArray;

public class MissingArray {

    public static void main(String[] args) {
        int[] arr= ArrayInitiaze.utility();
        System.out.println(missingElement(arr));
    }
    static int missingElement(int[] arr){

        int sum=0;
        int n=arr.length+1;
        int totalSum= ((n*n)+n)/2;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }

        int miss=totalSum-sum;
        return miss;
    }

}
