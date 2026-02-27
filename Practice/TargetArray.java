package Practice;

public class TargetArray {
    public static void main(String[] args) {
        int[] arr={23,43,54,11,21,2,1,32};
        int target=21;
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                flag=true;
                break;
            }
        } 
        if(flag){
            System.out.println("Exist");
        }else {
            System.out.println("Not exist");
        }

    }
}
