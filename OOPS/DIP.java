package OOPS;

interface Switchable{
    void turnOff();
    void turnOn();
} 

class Bulb implements Switchable{
    public void turnOff(){
        System.out.println("Device is off");
    }
    public void turnOn(){
        System.out.println("Device is on");
    }
}
class Light implements Switchable{
    public void turnOff(){
        System.out.println("Device is off");
    }
    public void turnOn(){
        System.out.println("Device is on");
    }
}

class Switch{

    private Switchable obj;

    Switch(Switchable obj){
        this.obj = obj;
    }
    public void turnOff(){
        System.out.println("Device is off");
    }
    public void turnOn(){
        System.out.println("Device is on");
    }
}

// Dependency Inversion Principle
public class DIP {
    public static void main(String[] args) {
        Switchable l1 = new Light();
        l1.turnOn();
        l1.turnOff();
        Switchable b1 = new Bulb();
        l1.turnOn();
        l1.turnOff();

        System.out.println("-------------------------");

        Switch lightSwitch =  new Switch(l1);
        l1.turnOn();
        l1.turnOff();

    }
}
