package PracticeArray;

public class WaveArray {
    static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        PrintArray(arr);
        System.out.println();
        int[] arr2=waveArray(arr);
        PrintArray(arr2);

    }
    static int[] waveArray(int[] arr){
        for (int i = 0; i < arr.length; i=i+2) {
            for (int j = i+1; j <= i+1; j++) {
                if(arr[i]<arr[j]){
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
            }
        }
        return arr;
    }
}
