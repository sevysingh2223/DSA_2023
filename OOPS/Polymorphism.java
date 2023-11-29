package OOPS;
class ABC{
    void display(){
        System.out.println("ABC");
    }
    void add(){
        System.out.println("NULL");
        return;
    }
    //function_overload : compile time
    public int add(int a , int b){
        return a+b;
    }
}

class XYZ extends ABC{
    @Override 
    //Overriding : run time
    void display(){
        super.display();
        System.out.println("XYZ");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        XYZ a = new XYZ();
        a.display();

        System.out.println("----------");
        ABC b = new ABC();
        b.display();
        b.add();
        System.out.println(b.add('a', 10));
    }

}
