package OOPS;

class A{
    void funct1(){
        System.out.println("A :: Hello");
    }
}
class B extends A{
    @Override
    void funct1(){
        System.out.println("B :: Hello");
    }
}

public class Ovverride {
    public static void main(String[] args) {
        // A obj1 = new A();
        // obj1.funct1();
        B obj2 = new B();
        obj2.funct1();
    }
}
