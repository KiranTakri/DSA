package SelectionSort;

public class LargestElement {
    static void Print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
            int[] arr={1,2,0,-3,4,-5,7,-8};
            Print(arr);
            Print(largestNo(arr));
    }
    static int[] largestNo(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int max = arr[0];
            int maxIdx = 0;

            for (int j = 1; j <= i; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxIdx = j;
                }
            }

            // swap max with last unsorted index
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        return arr;

    }
}
