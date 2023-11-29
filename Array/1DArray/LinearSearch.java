import java.util.Scanner;

public class LinearSearch {

    static int findTarget(int arr[] , int target){
        for (int i=0 ; i<arr.length;i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 45, 67, 89}; 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter target value");
        int target = scan.nextInt();
        if(findTarget(arr, target) == -1){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element found at index "+ findTarget(arr, target));
        }
    }
}
