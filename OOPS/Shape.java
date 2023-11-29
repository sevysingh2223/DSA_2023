package OOPS;

import Circle;

class Trigo{
    String s = "hello";
    Trigo(){
            System.out.println(s + "This is trigo class");

    }
}

class Circle extends Trigo{

    Circle(){
        super();
        System.out.println("I'm inside Default Constructor");
        System.out.println("Circle is created");
    }

    Circle(int x){
        System.out.println("I'm inside Parameterised Constructor of type int");
        System.out.println(x);
    }
    Circle(String str){
        this();
        System.out.println("I'm inside Parameterised Constructor of type string");
        System.out.println(str);
    }

    double radius;
    
    public void setRadius(double r){
        this.radius = r;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
}

class Rectangle extends Trigo{
    Rectangle(){
        super();
        System.out.println("Rectangle is created");
    }
    int length, breadth;

    public void setDimensions(int l , int b){
        this.length = l;
        this.breadth =b;
    }
    public double getArea(){
        return length * breadth;
    }
    public double getPerimeter(){
        return 2*length*breadth;
    }
}

class Square{
    int side;

    public void setSide(int s){
        this.side =s;
    }
    public double getArea(){
        return side*side;
    }
    public double getPerimeter(){
        return 4*side;
    }
}

public class Shape {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Square s = new Square();
        c.setRadius(5);
        System.out.println("Circle Area: " +c.getArea());
        System.out.println("Perimeter of Circle is : " + c.getPerimeter());
        System.out.println("----------------------------------");
        r.setDimensions(10, 20);
        System.out.println("Rectangle Area: "+r.getArea());
        System.out.println("Rectangle Perimeter: "+r.getPerimeter());
        System.out.println("----------------------------------");
        s.setSide(10);
        System.out.println("Square Area: "+s.getArea());
        System.out.println("Square Perimeter: "+s.getPerimeter());

        // Constructor is used to create / initialise an object
    // Class_name object = new Class_name();
    // Class_name() is the constructor
    // Constructor  name shouble be always as your class name
    // Default constructor
    // They are made by default and are hidden
    // It's a type of method
    // never return anything
    // Constructor is initialised only once and can be destroyed only once
    // By default constructore is present in every class

    // /Parameterized Constructor
        System.out.println("----------------------------------");

        // Circle c2 = new Circle();
        Circle c2 = new Circle("Hello");
    
    }
}


// S : SRP --> Single Responsibility Principle


