package PracticeArray;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr=ArrayInitiaze.utility();
        int num=6;
        System.out.println(searchingArray(arr,num));
    }
    static boolean searchingArray(int[] arr,int num){
        boolean bol=false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==num){
                bol=true;
            }
        }
        return bol;
    }
}
