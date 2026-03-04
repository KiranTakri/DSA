package SelectionSort;

import java.util.Arrays;

public class KthSmallestNumber {
    public static void main(String[] args) {
        int[] a={2,5,1,7,8,9};
        System.out.println(kSmallestElement(a,4));
    }
    static int kSmallestElement(int[] arr,int k){
        for(int i=0;i<k;i++){
            int secMin=Integer.MAX_VALUE;
            int mindx=-1;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<secMin){
                    secMin=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        return arr[k-1];
    }
}
