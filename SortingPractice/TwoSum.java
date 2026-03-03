package SortingPractice;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={0,2,3,4,7,8,10};
        int[] target=pairSum(arr,9);
        for (int ele:target){
            System.out.print(ele+" ");
        }
    }
    static int[] pairSum(int[] sum,int target){
        int[] newArray=new int[2];
       int i=0;
       int j=sum.length-1;
       while(i<j){
           if(sum[i]+sum[j]==target){
               newArray[0]=sum[i];
               newArray[1]=sum[j];
               break;
           } else if (sum[i]+sum[j]>target) {
               j--;
           } else if (sum[i]+sum[j]<target) {
               i++;
           }

       }
        return newArray;
    }
}
