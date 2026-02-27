package SelectionSort;

public class SecondSelection {
    static void Print(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={3,5,-1,-2,6,7,8,9,4};
        Print(arr);
        Print(selectionSort(arr));
    }
    static int[] selectionSort(int[] arr){
        int min=arr[0];
        int mindx=-1;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
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
