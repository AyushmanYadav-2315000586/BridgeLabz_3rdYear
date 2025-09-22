package oops_practice.class_Questions.OnlineCourseSystem;

public class User {
    protected String userId;
    protected String name;
    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }
    public String getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    
}
