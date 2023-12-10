package DSA_QUESTION.Recursion;

public class TOH {

    static void printHanoi(int n , char source , char helper , char destination){
        if(n == 1){
            System.out.println("Move Disk : " + source + " --> " + destination);
            return;
        }
        printHanoi(n-1, source, destination,helper);
        System.out.println("Move Disk : " + source + " --> " + destination);
        printHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        printHanoi(3, 'A', 'B', 'C');
    }
}
