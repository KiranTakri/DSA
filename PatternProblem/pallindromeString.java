package PatternProblem;

import java.util.Scanner;

public class pallindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        String str2="";
        for (int i = 0; i < n; i++) {
            char str1=str.charAt(i);
            str2=str1+str2;

        }
        if(str.equals(str2)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }

}
