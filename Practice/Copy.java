package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] x=arr;
        int[] y= Arrays.copyOf(arr,arr.length);
        x[0]=5;
        y[0]=7;
        System.out.println(arr[0]);
        System.out.println(x[0]);
        System.out.println(y[0]);
    }
}
