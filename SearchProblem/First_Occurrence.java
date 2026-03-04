package SearchProblem;

public class First_Occurrence {
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,4,4,4,5,5,8,8,9,9,10,10};
        System.out.println(firstOccurrence(arr,4));
    }
    static int firstOccurrence(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        int idx=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                idx=mid;
                j=mid-1;
            }  else if (arr[mid]<target) {
            i=mid+1;
        } else {
            j=mid-1;
        }
        }
        return idx;
    }
}
