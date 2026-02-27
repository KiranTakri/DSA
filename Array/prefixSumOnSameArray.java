package Array;

public class prefixSumOnSameArray {
    public static void main(String[] args) {
        int[] array=ArrayInitiaze.initialize();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int[] newArray=sumArray(array);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }

    }
    static int[] sumArray(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
}
