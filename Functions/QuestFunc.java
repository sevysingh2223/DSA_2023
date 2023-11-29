package Functions;

public class QuestFunc {
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, char b){
        return a+b;
    }
    static int sum(char a, char b){
        return a+b;
    }
    static int sum(int a, int b , int c){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("FIRST FUNCT : " + sum(5, 10));
        System.out.println("------------------------");
        System.out.println("SECOND FUNCT : " + sum(5, 'a'));
        System.out.println("------------------------");
        System.out.println("THIRD FUNCT : " + sum('a','b'));

    }
}
