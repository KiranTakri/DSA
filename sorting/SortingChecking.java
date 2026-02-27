package sorting;

import Array.ArrayInitiaze;

public class SortingChecking {
    public static void main(String[] args) {
        int[] arr= {0,1,3,4};
        System.out.println(checkArray(arr));
    }
    static boolean checkArray(int[] arr){
        boolean check=true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                check=false;
                break;
            }
        }
       return check;
    }
}
