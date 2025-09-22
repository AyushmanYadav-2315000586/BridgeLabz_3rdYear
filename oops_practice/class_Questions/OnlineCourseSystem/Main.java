package oops_practice.class_Questions.OnlineCourseSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1= new Teacher("T01", "Sahil Sir", "Java");
        Student s1= new Student("S01", "Ayushman", "O");
        Student s2= new Student("S02", "Prashant", "A+");
        Course c1= new Course("C01", "Java Programming", t1,10);
        c1.enrollStudent(s1);
        c1.enrollStudent(s2);
        System.out.println("Course: " + c1.getTitle());
        System.out.println("Teacher: " + c1.getTeacher().getName() + ", Subject: " + c1.getTeacher().getSubject());
        System.out.println("Enrolled Students:");
        for(int i=0; i<c1.getStudentCount(); i++){
            System.out.println(c1.getEnrolledStudents()[i].getName());
        }
    }
}
