package Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] array={6,8,1,2,4,9,0};
        int d=3;
        arrayRotate(array);
        arrReverse1(array);
        int[] arr=arrReverse2(array);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
    static int[] arrayRotate(int[] arr){
       int i=0;
       int j=arr.length-1;
       while(i<j){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
        return arr;
    }
    static int[] arrReverse1(int[] arr){
        int i=0;
        int j=3;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        return arr;
    }
    static int[] arrReverse2(int[] arr){
        int i=4;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        return arr;
    }
}
