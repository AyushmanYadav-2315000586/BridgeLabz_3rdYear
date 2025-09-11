package CombinedOverloading_Overriding;

public class Printer {

    public void print(String message){
        System.out.println("String message: "+message);
    }
    public void print(int number){
        System.out.println("Integer number: "+number);
    }
}
