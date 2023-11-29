package OOPS;

final class Student{
    final void greetMessage(){
        System.out.println("Student :: Hello ");
    }
}

class Course extends Student{
    // @Override
    // void greetMessage(){
    //     System.out.println("Course :: Hello");
    // }
    void greetMessage2(){
        System.out.println("Course :: Hello");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final float PI =3.14f;
        System.out.println(PI);

        Course st = new Course();
        st.greetMessage();    
}
}
