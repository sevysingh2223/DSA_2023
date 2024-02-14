package BitsManipulation;

public class AndOperator {
    public static void main(String[] args) {
        int x = 5, y = 3;
        // int z = x&y;
        System.out.println(x&y); //prints 1 because only the common set bits are kept in 'z' i
        System.out.println(x|y);
        System.out.println(~x);//complement of x is printed which gives -6
        System.out.println(x^y);
        int z =20;
        System.out.println(z << 1);
        System.out.println(z << 2);
        System.out.println(z << 3);
        System.out.println(z << 4);
        System.out.println("----------------------------");
        System.out.println(z >> 1);
        System.out.println(z >> 2);
        System.out.println(z >> 3);
        System.out.println(z >> 4);
        System.out.println(z >> 5);

    }
}
