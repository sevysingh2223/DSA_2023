package Inheritance;

class Living{
    Living(){
        System.out.println("Hello from Living");
    }
    void display(){
        System.out.println("LIVING CLASS");
    }
}

class Animal extends Living{
    Animal(){
        System.out.println("Hello from Animal Class");
    }
    @Override
    void display(){
        System.out.println("ANIMAL CLASS");
    }
}

class Dog extends Animal{
    Dog(){
        System.out.println("Hello from Dog");
    }
    @Override
    void display(){
        System.out.println("DOG CLASS");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
