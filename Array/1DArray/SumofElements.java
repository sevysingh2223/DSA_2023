public class SumofElements {
    public static void main(String[] args) {
        int arr[]={5,7,9,4,6,3,4};
        int sum = 0;
        for (int i : arr) {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum of elements is : " + sum);
    }
}
