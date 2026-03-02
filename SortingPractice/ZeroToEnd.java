package SortingPractice;

public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,8,9,0,4,5,12};
        int[] arr2=zeroArray(arr);
        for (int ele:arr2){
            System.out.print(ele+" ");
        }
    }
    static int[] zeroArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]==0){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }

            }

        }
        return arr;
    }
}
