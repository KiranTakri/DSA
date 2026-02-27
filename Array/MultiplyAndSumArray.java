package Array;

public class MultiplyAndSumArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,8,7};
        int[] ans=sumAndMulArray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }

    }
    static int[] sumAndMulArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i%2==1){
                arr[i]*=2;
            }else{
                arr[i]+=10;
            }
        }
        return arr;
    }
}
