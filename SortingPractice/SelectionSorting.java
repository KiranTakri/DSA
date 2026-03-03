package SortingPractice;

public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr={98,2,-3,65,74,3,2,0,-67};
        int[] sortArray=sortingArray(arr);
        for(int ele:sortArray){
            System.out.print(ele+" ");
        }
    }
    static int[] sortingArray(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            int min=Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;

        }
        return arr;
    }
}
