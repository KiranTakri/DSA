package Array;

public class missingArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7};
        System.out.println(missElement(arr));

    }
    static int missElement(int[] arr){
        int n=arr.length+1;
        int sum=0;
        int totalSum= n*(n+1)/2;
        for (int i = 0; i <n-1 ; i++) {
            sum+=arr[i];
        }
        int ele=totalSum-sum;
        return ele;
    }
}
