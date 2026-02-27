package sorting;

public class BubbleSortBestCase {
    static void printArray(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={4,5,-1,2,6,0,-4};
        printArray(arr);
        int[] arr2=sorting(arr);
        printArray(arr2);
        int[] arr3=reverse(arr);
        printArray(arr3);
    }
    public static int[] sorting(int[] arr){
        int swap=0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=1;j< arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break ;
            }
        }
        return arr;
    }
    public static int[] reverse(int[] arr){
    arr=sorting(arr);
    int i=0;
    int j=arr.length-1;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
        return arr;
    }
}
