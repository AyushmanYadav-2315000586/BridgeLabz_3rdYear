package oops_practice.class_Questions.HospitalManagementSystem;

public class PatientReportImpl implements IReportGenerator {
    private Patient patient;
    private Appointment appointment;

    public PatientReportImpl(Patient patient, Appointment appointment) {
        this.patient = patient;
        this.appointment = appointment;
    }

    @Override
    public void generateReport() {
        System.out.println("Patient Report");
        System.out.println("--------------");
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Disease: " + patient.getDisease());
        System.out.println("Appointment ID: " + appointment.getAppointmentId());
        System.out.println("Doctor: " + appointment.getDoctor().getName());
        System.out.println("Specialization: " + appointment.getDoctor().getSpecialization());
        System.out.println("Appointment Date: " + appointment.getAppointmentDate());
    }
    
}
