package oops_practice.Inherit.classWork;


/*
 * Inheritance: Person -> Student -> Teacher
 * Design a class hierarchy using inheritance:
 * - Base Class Person: fields: name, age; method: displayInfo()
 * - Subclass Student: field rollnumber, override displayInfo()
 * - Subclass Teacher: field subject, override displayInfo()
 * In the main method:
 * - create a student object and a teacher object
 * - call their displayInfo() on both objects
 * Tests: Reusability + extended behavior in subclasses
 */

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
