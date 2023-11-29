package Inheritance;

// class Swim{
//     void swim(){
//         System.out.println("I can Swim...");
//     }
// }

// class Fly{
//     void fly(){
//         System.out.println("I can Fly...");
//     }
// }

// class Bird extends Swim, Fly{

// }


interface Swim{
    // abstract : declare in superclass but must defined in subclass
    void swim();
}

interface Fly{
    void fly();
}

class Bird implements Swim, Fly{
    public void swim(){
        System.out.println("I can SWIM");
    }

    public void fly(){
        System.out.println("I can fly");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.swim();
        bird.fly();
    }
}
