package oops_practice.class_Questions.HospitalManagementSystem;


public class Main {
    public static void main(String[] args) {
        Patient p1= new Patient("P01", "Ayushman", 19, "Fever");
        Doctor d1= new Doctor("D01", "Dr. Smith", "General Physician");
        Appointment a1= new Appointment("A01", p1, d1, "2024-10-15");
        IReportGenerator reportGenerator= new PatientReportImpl(p1, a1);
        reportGenerator.generateReport();

    }
}
