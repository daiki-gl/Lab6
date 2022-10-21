import java.util.*;

public class Lab6 {
    public static void main(String[] args) {
        Integer arr_i[] = {2,8,20,3,4};
        Double arr_d[] = {2.7,3.8,5.5,6.7,9.7};
        array_max(arr_i);
        array_max(arr_d);
    }

    public static <T extends Comparable<T>> void array_max(T[] arr){
        T max = arr[0];

            for(T val : arr){
            if(val.compareTo(max) > 0) max = val;
        }
        System.out.println(max);
    }
}
