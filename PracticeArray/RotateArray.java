package PracticeArray;

public class RotateArray {
    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        PrintArray(arr);
        System.out.println();
        int[] rotate=rotateArray(arr,3);
        PrintArray(rotate);
    }
    static int[] rotateArray(int[] arr,int d){
        int i=0;
        int j=d;
        while(i<j){
            int swap=arr[i];
            arr[i]=arr[j];
            arr[j]=swap;
            i++;
            j--;
        }
        int l=d+1;
        int k= arr.length-1;
        while(l<k){
            int swap=arr[l];
            arr[l]=arr[k];
            arr[k]=swap;
            l++;
            k--;
        }
        for (int m = 0; m < arr.length/2; m++) {
            int swap=arr[m];
            arr[m]=arr[arr.length-1-m];
            arr[arr.length-1-m]=swap;

        }
        return arr;
    }
}
