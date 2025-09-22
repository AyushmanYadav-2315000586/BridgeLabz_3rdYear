package oops_practice.class_Questions.OnlineCourseSystem;

public class Teacher extends User {
    private String subject;

    public Teacher(String userId, String name, String subject) {
        super(userId, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    
}
