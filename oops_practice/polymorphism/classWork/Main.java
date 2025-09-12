package classWork;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(4.0, 6.0);
        Shape[] shape= new Shape[2];
        shape[0]=s1;
        shape[1]=s2;
        for(int i=0; i<shape.length;i++){
            System.out.println("Area of "+shape[i].shapeName()+ " is: "+shape[i].area());
        }
    }
}
