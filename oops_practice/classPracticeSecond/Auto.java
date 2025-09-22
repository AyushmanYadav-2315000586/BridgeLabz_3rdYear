package oops_practice.classPracticeSecond;

public class Auto extends Vehicle implements IfareCalculator {
    private final double baseFare=15.0;
    public Auto(double speed, double baseFare) {
        super(speed, baseFare);

    }
    @Override
    public double calculateFare() {
        return baseFare * distance;
    }
    
    @Override
    public void fare() {
        
        System.out.println("Fare for Auto: " + calculateFare());
    }

    
}
