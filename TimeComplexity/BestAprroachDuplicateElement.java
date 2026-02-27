package TimeComplexity;

import Array.ArrayInitiaze;

public class BestAprroachDuplicateElement {
    public static void main(String[] args) {
        int[] arr= ArrayInitiaze.initialize();
        System.out.println(duplicateElement(arr, arr.length));
    }
    static int duplicateElement(int[] arr,int n){
        int totalSum=0;
        for (int i = 0; i < arr.length; i++) {
            totalSum+=arr[i];
        }
        int sum=((n-1)*n)/2;
        int duplicate=totalSum-sum;
        return duplicate;
    }
}
