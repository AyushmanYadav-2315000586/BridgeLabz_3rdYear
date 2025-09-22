package oops_practice.classPracticeSecond;
/*
 * 1. RideRoute – Smart Transportation Booking System

Story: A city transport app lets users book bikes, cars, or auto-rickshaws. Each vehicle type has different fare calculations and ride rules. The developer uses:

● An abstract class Vehicle with common properties (speed, fare).
● Separate child classes (Bike, Car, Auto) that implement their own fare logic using
overridden methods.
● A FareCalculator interface for dynamic pricing algorithms.

Focus Concepts:
● Inheritance
● Abstraction
● Interfaces
● Polymorphism
● Sequence diagram to show User → App → Vehicle → Fare flow
 */
public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike(40.0, 5.0);
        bike.fare();

        Vehicle car = new Car(60.0, 10.0);
        car.fare();

        Vehicle auto = new Auto(30.0, 3.0);
        auto.fare();
    }
    
}
