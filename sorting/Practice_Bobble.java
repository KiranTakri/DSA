package sorting;

public class Practice_Bobble {
    public static void main(String[] args) {
        int[] arr={2,4,5,3,-1,0,4};
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted=true;
            for (int j=1;j< arr.length;j++){
                if(arr[j]<arr[j-1]){
                    isSorted=false;
                }
            }
            if(isSorted==true){
                break;
            }
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
            
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
