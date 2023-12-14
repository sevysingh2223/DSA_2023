package DSA_QUESTION.Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        
        int arr[] ={3,5,7,9,12,16,25,39,48,85};
        int n = arr.length;
        int target = 85;
        int low = 0;
        int high = n-1;
        int flag = 0;

        while(low<=high){
            int mid = (low + high) /2;
            if(arr[mid] == target){
                flag = mid;
                break;
            }
            if(arr[mid] < target){
                low = mid+1;
            }
            if(arr[mid] > target){
                high = mid-1;
            }
        }

        if(flag!=0){
            System.out.println("Element Found at index : " + flag);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
