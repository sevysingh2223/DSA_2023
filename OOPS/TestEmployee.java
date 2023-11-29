package OOPS;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        // System.out.println("ID : " + emp1.id);
        // System.out.println("Name : " + emp1.name);
        // System.out.println("Salary : " + emp1.salary);
        // System.out.println("Employee : " + emp1);

        Employee emp2 = new Employee();
        // System.out.println("ID : " + emp2.id);
        // System.out.println("Name : " + emp2.name);
        // System.out.println("Salary : " + emp.salary);
        // System.out.println("Employee : " + emp2);

        emp1.takeInput(101, "ram", 5000);
        emp2.takeInput(0, "syam", 0);
        emp1.print();
        emp2.print();
        System.out.println("-----------------------------------------------");
        System.out.println(emp1.name);

        // DRY Principle : Do not repeat yourself
        // Object class : hashcode
        // Object class : toString
    
        // Employee : OOPS.Employee@1fb3ebeb
    }
}
