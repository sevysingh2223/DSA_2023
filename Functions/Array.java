package Functions;

import java.util.Arrays;

public class Array {

    static int[] printArr(int arr[] , int n){
        System.out.println("Length of array is : " + n);
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        int arr[] ={45,8,59,2};
        System.out.println(printArr(arr , arr.length));
    }
}
