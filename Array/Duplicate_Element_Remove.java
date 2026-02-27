package Array;

public class Duplicate_Element_Remove {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,2,8};
        int ele=elementRemove(arr);
        System.out.println(ele);
    }
    public static int elementRemove(int[] arr){
        int n=arr.length;
        int j=0;
        for (int i = 1; i < n; i++) {
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];

            }

        }
        return 1+j;
    }
}
