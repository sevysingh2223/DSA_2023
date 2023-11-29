public class SecondMinMax {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, -3, 7};
        int min = arr[0];
        int max = arr[0];
        int smin = arr[0];
        int smax = arr[0];
        for (int i : arr) {
            if(min > i){
                smin = min;
                min = i;
            }
            if(max < i){
                smax = max;
                max = i;
            }
        }

        System.out.println("Min Element is : " + min );
        System.out.println("Max Element is : " + max );
        System.out.println("Second Min Element is : " + smin );
        System.out.println("Second Max Element is : " + smax );
    }
    
}
