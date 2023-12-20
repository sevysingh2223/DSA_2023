import java.util.Arrays;
import java.util.Stack;

public class NGE {

    public static void main(String[] args) {
        int arr[] = { 4, 2, 10, 7, 11 };
        Stack<Integer> stack = new Stack<>();
        int arr1[] = new int[arr.length];
        Arrays.fill(arr1, -1);

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            while (!stack.empty() && arr[stack.peek()] < current) {
                arr1[stack.pop()] = current;
            }
            stack.push(i);
        }

        for (int i : arr1) {
            System.out.print(i + "    ");
        }
    }
}