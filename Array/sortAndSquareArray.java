package Array;

public class sortAndSquareArray {
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.initialize();
        int[] num=squareSortedArray(arr);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    static int[] squareSortedArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*arr[i];
        }
        for(int i=0;i< arr.length;i++){
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        return arr;
    }
}
