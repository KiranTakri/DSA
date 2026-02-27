package PatternProblem;

public class PallindomeTwoPointer {
    public static void main(String[] args) {
        String str="AMA";
        if(pallindrome(str)){
            System.out.println(" Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
    static boolean pallindrome(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }


}
