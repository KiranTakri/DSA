package sorting;

public class ZeroToEnd {
    public static void Print(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,0,0,3,4,6};
        Print(zeroEndedArray(arr));
    }
    public static int[] zeroEndedArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]==0){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
        return arr;
    }
}
