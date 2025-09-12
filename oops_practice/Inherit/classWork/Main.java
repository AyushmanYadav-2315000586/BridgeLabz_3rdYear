package oops_practice.Inherit.classWork;

public class Main {
    public static void main(String[] args) {
        Person p1= new Person("Ayushman", 19);
        p1.displayInfo();
        Student s1= new Student("Rohan", 20, 43);        
        s1.displayInfo();
        Teacher t1= new Teacher("Mr. Sharma", 45, "Mathematics");
        t1.displayInfo();
    }
}
