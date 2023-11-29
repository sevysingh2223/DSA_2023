public class PlusOneToElement {
    public static void main(String[] args) {
        int arr[] ={5,8,6,9,4};
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] + 1;
        }

        for (int i : arr) {
            System.out.print( i + "  ");
        }
    }
}
