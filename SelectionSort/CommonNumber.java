package SelectionSort;

import java.util.ArrayList;

public class CommonNumber {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b={2,4,6};
        ArrayList<Integer> c=commonArray(a,b);
        for (int ele:c){
            System.out.print(ele+" ");
        }
        
    }
    static ArrayList<Integer> commonArray(int[] a, int[] b){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int j=0;
       while (i<a.length && j<b.length){
           if(a[i]==b[j]){
               list.add(a[i]);
               i++;
               j++;
           } else if (a[i]>b[j]) {
               j++;
           }else{
               i++;
           }

       }
        return list;
    }
}
