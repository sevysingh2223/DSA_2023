package OOPS;

class Shape{
    double size;
    void calculateArea(){
        System.out.println("Area Calculated");
    }

    double getSize(){
        return size;
    }
}

class Rectangle extends Shape{

    int l;
    int b;

    Rectangle(int x, int y){
        System.out.println("Rectangle Object Created");
        this.l = x;
        this.b =y;
    }
    void calculateArea(){

        System.out.println("Area Calculated");
    }

    double getSize(){
        return (l*b);
    }
}

class Square extends Shape{
    int s;
    Square(int side){
        System.out.println("Square Object Created");
        this.s = side;
    }
    void calculateArea(){
        System.out.println("Area Calculated");
    }

    double getSize(){
        return (s*s);
    }
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        System.out.println("Circle Object Created");
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println("Area Calculated");
    }

    double getSize(){
        return (3.14 * radius *radius);
    }
}
public class LSP {

    public static void shapeFunc(Shape obj){
        obj.calculateArea();
        System.out.println(obj.getSize());
        System.out.println("===========");
    }
    public static void main(String[] args) {
        Shape circle = new Circle(7);

        shapeFunc(circle);
        Shape circle1 = new Circle(7);

        shapeFunc(circle1);
        Shape circle3 = new Circle(7);
        
        shapeFunc(circle3);
        Shape square3 = new Square(7);
        shapeFunc(square3);
        Shape square4 = new Square(7);
        shapeFunc(square4);
    }
}
