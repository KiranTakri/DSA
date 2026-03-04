package sorting;

public class InsertionSorting {
    public static void main(String[] args) {
        int[] arr={21,3,4,76,4,0,-9};
        for(int ele:sortingArray(arr)){
            System.out.print(ele+" ");
        }
    }
    static int[] sortingArray(int[] a){
        for (int i = 1; i < a.length; i++) {
            int j=i;
            while (j>0 && a[j]<a[j-1]){
                int swap=a[j];
                a[j]=a[j-1];
                a[j-1]=swap;
                j--;

            }
        }
        return a;
    }
}
