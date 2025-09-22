package oops_practice.classPracticeSecond;

public class Bike extends Vehicle implements IfareCalculator {
    private final double baseFare=10.0;
    public Bike(double speed, double distance) {
        super(speed, distance);

    }
    @Override
    public double calculateFare() {
        return baseFare * distance;
    }
    
    @Override
    public void fare() {
        System.out.println("Fare for Bike: " + calculateFare());
    }
    
}
