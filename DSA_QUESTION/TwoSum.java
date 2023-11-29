package DSA_QUESTION;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {5,7,6,9,4,3};
        int target = 11;
        int i , j=0;
        for(i=0;i<arr.length-1;i++){
            for(j=i+1;j<arr.length;j++){
                if((arr[i] + arr[j]) != target){
                    System.out.println(arr[i] + "  And   " + arr[j]);
                }
            }
        }

        // System.out.println(arr[j]);
        System.out.println(j);
    }
}
