package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = ArrayInitiaze.initialize();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int[] reverse=arrReverse(array);
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]+" ");
        }

//        int[] reverse=reverseArray(array);
//        System.out.println();
//        for (int i = 0; i < reverse.length; i++) {
//
//            System.out.print(reverse[i]+" ");
//        }
//    }
//    static int[] reverseArray(int[] arr){
//        int i=0;
//        int j= arr.length-1;
//        while(i<j){
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//            i++;
//            j--;
//        }
//        return arr;
//    }
    }
    static int[] arrReverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;

        }
        return arr;
    }
}
