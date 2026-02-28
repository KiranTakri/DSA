package PracticeArray;

public class Twosum {
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        int[] sumArray=sumArray(arr,4);
        for (int i = 0; i < sumArray.length; i++) {
            System.out.print(sumArray[i]+" ");
        }
    }
    static int[] sumArray(int[] arr,int target){
        int[] arr2=new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==target){
                    arr2[0]=i;
                    arr2[1]=j;
                }
            }

        }
        return arr2;
    }
}
