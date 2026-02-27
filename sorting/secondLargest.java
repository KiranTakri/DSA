package sorting;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr={3,2,5,1,7,4};
        largestElement(arr);
        System.out.println(secondLargest(arr));
    }
    static void largestElement(int[] arr){
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(max==arr[i]){
                arr[i]=-1;
            }
        }
    }
    static int secondLargest(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
