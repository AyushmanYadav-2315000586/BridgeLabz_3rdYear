package MethodOverloading;

public class AreaCalculator {
    public double area(double radius){
        return Math.PI * radius * radius;
    }
    public int area(int length, int width){
        return length * width;
    }
    public int area(int side){
        return side * side;
    }
    @Override
    public String toString(){
        return "AreaCalculator class";
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        System.out.println(ac.area(10));
        System.out.println(ac.area(10, 20));
        System.out.println(ac.area(10));
        System.out.println(ac);
        Object obj= new Object();
        System.out.println(obj.toString());
    }

}
