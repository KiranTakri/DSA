package sorting;

public class BoobleSortt {
    static void print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted=true;
            for (int j = 1; j < arr.length; j++) {
                if(arr[j]<arr[j-1]){
                    isSorted=false;
                    break;
                }

            }
            if (isSorted==true){
                break;
            }
            int swap=0;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
        print(arr);
    }
}
