package MethodOverloading;

public class MathUtils {

    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        MathUtils m= new MathUtils();
        System.out.println(m.add(5, 10));
        System.out.println(m.add(5.0, 10.0));
        System.out.println(m.add(5, 10, 15));
    }
    
}
