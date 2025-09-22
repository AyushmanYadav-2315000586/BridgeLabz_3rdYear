package oops_practice.classPracticeSecond;

public class Car extends Vehicle implements IfareCalculator {
    private final double farePerKm=20.0;
    public Car(double speed, double distance) {
        super(speed, distance);
    }
    @Override
    public double calculateFare() {
        return farePerKm * distance;
    }
    @Override
    public void fare() {
        System.out.println("Fare for Car: " + calculateFare());
    }
    
}
