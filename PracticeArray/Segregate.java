package PracticeArray;

public class Segregate {
    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        PrintArray(arr);
        System.out.println();
        int[] arr2=segregateArray(arr);
        PrintArray(arr2);
    }
    static int[] segregateArray(int[] arr){
        int i=0;
        int j= arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
                i++;
                j--;

            }
            else if(arr[i]==0){
                i++;
            }
            else if(arr[j]==1){
                j--;
            }
        }
        return arr;
    }
}
