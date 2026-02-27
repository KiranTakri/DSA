package sorting;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr={5,3,2,6,7};
        int[] sortArray=ArraySort(arr);
        for(int i:sortArray){
            System.out.print(i+" ");
        }
    }
    static int[] ArraySort(int[] arr){

        for (int i = 0; i < arr.length ; i++) {
            boolean isSort=true;
            for (int j= 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    isSort=false;
                    break;
                }
            }
            if(isSort==true){
                break;
            }
            int swap=0;
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                swap++;
            }
            if(swap==0){
                break;
            }
        }

        return arr;
    }
}
