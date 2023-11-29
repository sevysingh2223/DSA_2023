package Functions;

public class BooleanFunc {

    static boolean func(int a) {
        if (a % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // System.out.println("TRUE : Odd AND FALSE : Even");
        int n = 8;
        // System.out.println(n);
        // System.out.println(func(n));

        if (func(n)) {
            System.out.println("NUMBER IS EVEN");
        } else {
            System.out.println("NUMBER IS ODD");
        }
    }
}
