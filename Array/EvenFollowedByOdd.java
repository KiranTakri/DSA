package Array;

public class EvenFollowedByOdd {
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.initialize();
        int[] num=evenOddArray(arr);
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    static int[] evenOddArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[j]%2==0 && arr[i]%2!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;

            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2!=0){
                j--;
            }
        }
        return arr;
    }
}
