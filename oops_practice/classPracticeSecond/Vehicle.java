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
public abstract class Vehicle {
    public double speed;
    public double distance;
    public Vehicle(double speed, double distance) {
        this.speed = speed;
        this.distance = distance;
    }
    public abstract void fare();
}
