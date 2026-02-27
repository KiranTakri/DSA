package SelectionSort;

public class Practice_SelectionSOrt {
    static void Print(int[] arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={4,5,1,2,8,-3,2,-7,5};
        Print(arr);
        Print(sorting(arr));
    }
    static int[] sorting(int[] arr){
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
        return arr;
    }

}
