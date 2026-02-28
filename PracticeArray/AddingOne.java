package PracticeArray;

import java.util.ArrayList;
import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(9);
        System.out.println(list);  // [2, 4, 6, 8]

        int sum = 0;
        for (int i = 0; i <= list.size() - 1; i++) {
            sum = sum * 10 + list.get(i);
        }
        System.out.println(sum);  // 8642

        int sum2 = sum + 1;  // 8643
        ArrayList<Integer> arrayList = new ArrayList<>();

        int i=0;
        while (sum2 > i) {
            int digit = sum2 % 10;
            arrayList.add(i, digit);  // Add at index 0 to reverse order
            sum2 /= 10;
        }

        System.out.println(arrayList);  // [8, 6, 4, 3]
    }
}
