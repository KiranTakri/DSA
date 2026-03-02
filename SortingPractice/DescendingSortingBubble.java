package SortingPractice;

public class DescendingSortingBubble {
    public static void main(String[] args) {
        int[] num={3,21,24,6,7,0,-1,-7,-8,3,5};
        int[] num2=descArray(num);
        for (int ele: num2){
            System.out.print(ele+" ");
        }
    }
    static int[] descArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int swap=0;
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0)break;
        }
        return arr;
    }
}
