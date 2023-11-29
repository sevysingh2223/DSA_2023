package DSA_QUESTION.Array;

import java.util.Scanner;

public class SubarraySumK {

    static int[] kSum(int i , int j , int []arr,int k){
        int n =arr.length;
        int max =0;
        int res_arr[] = new int[2];
         outerLoop:
        for( i=0;i<n;i++){  
            for(j =0;j<n;j++){
                max +=arr[j];
                if(max==k){
                    res_arr[0] = i;
                    res_arr[1] = j;
                    return res_arr;
                }
                if(max > k){
                    max =0;
                    break outerLoop;
                }
            } 
        }
        return res_arr;
    }
    public static void main(String[] args) {
        System.out.println("enter the no of elements of the array");
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int [n];
        System.out.print("elements of the array is:: ");
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum --");
        int k =sc.nextInt();

        int res_arr[] = kSum(0, 0, arr, k);
       
        int start = res_arr[0];
        int end = res_arr[1];
        for (int l = start;l<=end;l++){
                System.out.print(arr[l] + " ");
            } 
        sc.close();
    }
    
}
