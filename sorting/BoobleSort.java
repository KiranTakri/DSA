package sorting;

public class BoobleSort {
    public static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={-2,4,1,5,2,2,0};
        print(arr);
        for(int i=0;i<arr.length-1;i++){
            for (int j = 1; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        print(arr);
    }
}
