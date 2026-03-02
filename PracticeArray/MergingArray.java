package PracticeArray;

public class MergingArray {
    public static void main(String[] args) {
        int[] a={2,5,6,9,20};
        int[] b={1,3,4,5,7,8};
        int[] c=mergeArray(a,b);
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
    static int[] mergeArray(int[] a,int[] b){
        int[] c=new int[a.length+b.length];
        int i=0,j=0,k=0;
        while(i< a.length && j<b.length){
            if(a[i]<b[j]){
                c[k]=a[i];
                i++;
            }else {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i==a.length){
            while (j<b.length){
                c[k]=b[j];
                j++;
                k++;
            }
        }if(j==b.length){
            while (i<a.length){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        return c;
    }
}
