package Array;

public class squareSort {
    public static void main(String[] args) {
        int[] num=ArrayInitiaze.initialize();
        int[] arr=sortedSqure(num);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int[] sortedSqure(int[] arr){
        int i=0;
        int j= arr.length-1;
        int k=0;
        int[] ans=new int[arr.length];
        while(i<j){
            if (Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k++]=arr[i]*arr[i];

                i++;
            }else {
                ans[k++]=arr[j]*arr[j];
                
                j--;
            }
        }

        return ans;
    }
}
