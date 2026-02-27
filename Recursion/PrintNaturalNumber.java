package Recursion;

public class PrintNaturalNumber {
    public static void main(String[] args) {
        naturalNo(10);
    }
    public static void naturalNo(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        naturalNo(n-1);
        System.out.println(n);
    }
}
