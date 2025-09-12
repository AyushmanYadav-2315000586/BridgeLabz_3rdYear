package classWork;

/*
 * Create an abstract class Shape with an abstract method area().
 * - Circle: field radius, area() implementation
 * - Rectangle: fields length, width, area() implementation
 * In the main method:
 * - Create an array of Shape references holding Circle and Rectangle
 * - Loop through and call area() on each
 * Tests: Polymorphism(method calls depend on object type)
 */

public abstract class Shape {
    public abstract double area();
    public abstract String shapeName();
}
