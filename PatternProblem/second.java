package PatternProblem;

public class second {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0){
                    System.out.print("A"+" ");
                }else{
                    System.out.print("B"+" ");

                }
            }
            System.out.println();

        }
    }
}
