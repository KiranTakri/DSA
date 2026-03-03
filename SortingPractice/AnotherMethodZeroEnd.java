package SortingPractice;

public class AnotherMethodZeroEnd {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,8,9,0,4,5,12};
        int[] arr2=zeroEnd(arr);
        for (int ele:arr2){
            System.out.print(ele+" ");
        }
    }
    static int[] zeroEnd(int[] arr){
        int n= arr.length;
        int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        return arr;
    }
}
