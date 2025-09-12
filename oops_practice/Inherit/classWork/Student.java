package oops_practice.Inherit.classWork;

public class Student extends Person{
    private int rollnumber;
    public Student(String name, int age, int rollnumber){
        super(name,age);
        this.rollnumber=rollnumber;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Roll Number: "+rollnumber);
    }
    
}
