package SelectionSort;

import java.util.Arrays;

public class FindSumPair {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 0};
        int target=9;
        Arrays.sort(arr);
        int[] nums=new int[2];
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==target){
                nums[0]=arr[i];
                nums[1]=arr[j];
                break;
            } else if (arr[i]+arr[j]>target) {
                j--;
            }else{
                i++;
            }
        }
        for (int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
