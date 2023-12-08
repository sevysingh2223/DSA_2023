package DSA_QUESTION.Recursion;

public class RopeCuttingProblem {

    static int ropeCut(int n, int a, int b){

        if(n==0){
            return 0;
        }
        if(n<0){
            return -1;
        }
        int cutA = ropeCut(n-a, a, b);
        int cutB = ropeCut(n-b, a, b);
        // int cutC = ropeCut(n-c, a, b);

        int piece = Math.max(cutA, cutB);

        if(piece == -1){
            return -1;
        }
        return piece +1;

    }
    public static void main(String[] args) {
        System.out.println(ropeCut(6, 2,3));
    }
}
