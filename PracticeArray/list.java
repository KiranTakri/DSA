package PracticeArray;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> data=new ArrayList<>();
        data.add(2);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the number "+i+" ");
            int num=sc.nextInt();
            data.add(num);
        }
        System.out.println(data);
    }
}
