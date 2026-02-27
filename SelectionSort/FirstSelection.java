package SelectionSort;

public class FirstSelection {
    public static void main(String[] args) {
        int[] arr={3,2,1,6,7,8,-1,-3,5};
        for (int i = 0; i < arr.length; i++) {
            int min=arr[i];
            int mindx=i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
