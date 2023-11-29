package OOPS;

// public , private , protected
// public -- accessible by all (class, method , packages, folders)
// private -- accessible within the same class
// protected

class A1{
    private int a =10;
    protected int result = 89;
    int z =10;
    A1(){
        System.out.println("Constructor _ A");
        System.out.println("Value of a is ; " +a);
        System.out.println("Value of result is ; " + result);
    }
    void display(){
        System.out.println("Value of a : " +a);
        System.out.println("Hello user from class A");
        System.out.println("Result is : " +result);
    }
}
class B1 extends A1{
    public int b =10;
    B1(){
        System.out.println("Value of result : B class" + result);
        System.out.println("Value of z : B class" + z);
        System.out.println("Constructor _ B");
    }
    @Override
    void display(){
        System.out.println("Hello user from class B");
        System.out.println("Result is : " +result + "(From B class)");
    }
}


public class AccessModifiers {
    public static void main(String[] args) {
        // B1 objB = new B1();
        // objB.display();
        // System.out.println("Result Was : " + objB.result);
        // System.out.println("Result Was : " + result);
        // System.out.println("Integer value of b "  + objB.b);
        // System.out.println("Integer value of a "  + objB.a);

        A1 obj2 = new A1();
        // obj2.a; a is private
        // obj2.result; protected

        
    }
}

// private : within the class
// protected : within the class + subclass 
// public : within the class + subclass + folders + packages