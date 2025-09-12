package oops_practice.Inherit.classWork;

public class Teacher extends Person{
    private String subject;
    public Teacher(String name, int age, String subject){
        super(name,age);
        this.subject=subject;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject: "+subject);
    }
}
