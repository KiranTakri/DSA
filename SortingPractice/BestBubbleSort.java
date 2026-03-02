package SortingPractice;
//Before the pass we can check if the array is sorted or not
public class BestBubbleSort {
    public static void main(String[] args) {
            int[] num={3,21,24,6,7,0,-1,-7,-8,3,5};
            int[] num2=sortedArray(num);
            for (int ele: num2){
                System.out.print(ele+" ");
            }
    }
    static int[] sortedArray(int[] num){
        int n=num.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted=true;
            for (int j = 0; j < num.length-1; j++) {
                if(num[j]>num[j+1]){
                    isSorted=false;
                    break;
                }
            }
            if (isSorted){
                break;
            }
            for (int j = 0; j < n-1; j++) {
                if(num[j]>num[j+1]){
                    int swap=num[j];
                    num[j]=num[j+1];
                    num[j+1]=swap;


                }
            }
        }
        return num;
    }
}
