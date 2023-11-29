package Inheritance;

interface Shape{
    int count=10;
    // abstract methods
    void display();
    void area();
    void perimeter();
}

class Rectangle implements Shape{

    Rectangle(){
        System.out.println("I'm a constructor of class Rectangle : Object Created");
    }

    void showDetails(){
        display();
        area();
        perimeter();
        extraMethod();
        System.out.println("Value of Count" + (count+10));
    }
    public void display(){
        System.out.println("I am a rectangle");
    }

    public void area(){
        System.out.println("Area is calculated");
    }

    public void perimeter(){
        System.out.println("Perimter is calculated");
    }

    void extraMethod(){
        System.out.println("Extra method");
    }
}

class Circle implements Shape{
    public void display(){
        System.out.println("I am a rectangle");
    }
    public void area(){
        System.out.println("Area is calculated");
    }

    public void perimeter(){
        System.out.println("Perimter is calculated");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.showDetails();
    }
}
