package sorting;

public class BestCaseEndedZero {
    static void Print(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,0,-2,3,0,4,8,0,10,12};
        Print(endedZero(arr));
    }
    public static int[] endedZero(int[] arr){
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
