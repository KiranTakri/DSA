package PracticeArray;

public class MulAnsAddOnArray {
    static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr= ArrayInitiaze.utility();
        System.out.println();
        PrintArray(mulAndAdd(arr));

    }
    static int[] mulAndAdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i%2==1){
                arr[i]*=2;
            }else{
                arr[i]+=10;
            }
        }
        return arr;
    }
}

