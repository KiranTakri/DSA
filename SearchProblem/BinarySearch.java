package SearchProblem;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,4,7,9,23,26,46,49,65,68};
        int target=65;
        if(isFound(arr,target)){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
    }
    static boolean isFound(int[] arr,int target){
        boolean flag=false;
        int i=0,j= arr.length-1;
        while(i<=j){
           int mid=(i+j)/2;
           if(arr[mid]==target){
               flag=true;
               break;
           } else if (arr[mid]<target) {
               i=mid+1;
           } else {
               j=mid-1;
           }
        }
        return flag;
    }
}
