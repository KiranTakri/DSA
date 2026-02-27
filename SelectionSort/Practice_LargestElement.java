package SelectionSort;

public class Practice_LargestElement {
    static void Print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            int[] arr={9,4,3,6,7,8,-1,2,-4};
            Print(arr);
            Print(sorting(arr));
    }
    static int[] sorting(int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            int max=arr[i];
            int maxdx=i;
            for (int j = 0; j < i; j++) {
                if(arr[j]>max){
                    max=arr[j];
                    maxdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxdx];
            arr[maxdx]=temp;

        }
        return arr;
    }
}
