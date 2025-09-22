package oops_practice.class_Questions.OnlineCourseSystem;

public class Course {
    private String courseID;
    private String title;
    private Teacher teacher;
    private Student[] enrolledStudents;
    private int studentCount;

    public Course(String courseId, String title, Teacher teacher,int maxStudents) {
        this.courseID = courseId;
        this.title = title;
        this.teacher = teacher;
        this.enrolledStudents = new Student[maxStudents];
        this.studentCount = 0;
    }
    public void enrollStudent(Student student) {
        if (studentCount < enrolledStudents.length) {
            enrolledStudents[studentCount++] = student;
        } else {
            System.out.println("Course is full. Cannot enroll more students.");
        }
    }
    public String getTitle() {
        return title;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public Student[] getEnrolledStudents() {
        return enrolledStudents;
    }
    public int getStudentCount() {
        return studentCount;
    }
    
}
