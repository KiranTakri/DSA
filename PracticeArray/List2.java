package PracticeArray;

import java.util.ArrayList;
import java.util.Collections;

public class List2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3,100);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
        int i=0,j=list.size()-1;
        while(i<j){
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
