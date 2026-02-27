package String;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int first=0,second=1;
        for (int i = 0; i < n; i++) {
            System.out.println(first+" ");
            int num=first+second;
            first=second;
            second=num;
            
        }
    }
}
