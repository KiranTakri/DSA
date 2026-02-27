package Array;

public class prefixSum {
    public static void main(String[] args) {
        int[] array=ArrayInitiaze.initialize();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int[] newArray=sumArray(array);
        for (int i = 0; i <newArray.length ; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
   static int[] sumArray(int[] arr){
        int[] newArray=new int[arr.length];
        newArray[0]=arr[0];
       for (int i = 1; i < arr.length; i++) {
           newArray[i]=newArray[i-1]+arr[i];
       }
        return newArray;
   }
}
