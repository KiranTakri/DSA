package String;

import java.util.Scanner;

public class ReverseChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the String ");
        String str=sc.nextLine();
        System.out.println(isReverse(str));

    }
    static boolean isReverse(String str){
        boolean isSorted=true;
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                isSorted=false;
            }
            i++;
            j--;
        }
        return isSorted;
    }
}
