public class MinElement {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, -3, 7};
        int min = arr[0];
        int max = arr[0];
        for (int i : arr) {
            if(min > i){
                min = i;
            }
            if(max < i){
                max = i;
            }
        }

        System.out.println("Min Element is : " + min );
        System.out.println("Max Element is : " + max );
    }
    
}
