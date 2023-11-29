package OOPS;

// Super class
final class Shape_2{
    Shape_2(){
        System.out.println("THIS IS THE SUPER CLASS");
    }

    final void greetMessage(){
        System.out.println("HELLO BY SHAPE_2");
    }
}

// Child class
// Super class declared as final class : so cannot inherit that
// class Circle_2 extends Shape_2{
class Circle_2{
    double radius;
    final double PI = 3.14;

    double printArea(){
        return PI * radius *radius;
    }
    // Because the super class has greetMessage method declare as final
    // Thats's why u  can't override the final method
    void greetMessage(){
        System.out.println("HELLO BY CIRCLE_2");
    }
}

public class Final {
    public static void main(String[] args) {
        final float PI = 3.14f;
        System.out.println("Before Updation : " + PI);
        // Making a variable as final won't allow u to update the data
        // PI += 10;
        // System.out.println("After Updation : " + PI);

        Circle_2 c = new Circle_2();
        c.radius = 5;
        System.out.println("AREA OF CIRCLE IS " + c.printArea());;
        c.greetMessage();
    }
}
