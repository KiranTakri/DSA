package Practice;

public class SortingArray {
    public static void main(String[] args) {
        int[] arr={6,3,4,2,7,1};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
