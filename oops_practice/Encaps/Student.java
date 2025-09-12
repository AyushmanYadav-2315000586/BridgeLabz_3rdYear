package oops_practice.Encaps;
class Student {
    private int studentRollNumber;
    private String studentName;
    private int studentAge;
    private String studentDepartment;
 
    public void setStudentRollNumber(int studentRollNumber){
        this.studentRollNumber=studentRollNumber;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setStudentAge(int studentAge){
        this.studentAge=studentAge;
    }
   public void setStudentDepartment(String studentDepartment){
        this.studentDepartment=studentDepartment;
    }
    public int getStudentRollNumber(){
        return studentRollNumber;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getStudentAge(){
        return studentAge;
    }
    public String getStudentDepartment(){
        return studentDepartment;
    }    
    @Override
    public String toString(){
        return "Student RollNumber:-"+getStudentRollNumber() +"\n Student Name:-"+getStudentName() +" \n Studen Age:-"+getStudentAge() +"\n Student Depart:-"+getStudentDepartment();
    }
}