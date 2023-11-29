package Functions;

public class TypesofFun {

    //Return Type With Arguments
    static int rWa(String a){
        System.out.println("I am Return Type With Arguments Function");
        System.out.println("My argument is : " + a);
        return 1;
    } 
    //Return Type With No Arguments
    static int rWNa(){
        System.out.println("I am Return Type With No Arguments Function");
        System.out.println("No arguments Passed");
        return 1;
    } 
    //No Return Type With Arguments
    static void nrWa(int a){
        System.out.println("I am No Return Type With Arguments Function");
        System.out.println("My argument is : " + a);
    } 
    //No Return Type With No Arguments
    static void nrWNa(){
        System.out.println("I am No Return Type With No Arguments Function");
        System.out.println("No arguments Passed");
    } 
    public static void main(String[] args) {
        System.out.println(rWa("USER"));
        System.out.println("------------------------------------");
        System.out.println(rWNa());
        System.out.println("------------------------------------");
        nrWa(600);
        System.out.println("------------------------------------");
        nrWNa();
    }
}
