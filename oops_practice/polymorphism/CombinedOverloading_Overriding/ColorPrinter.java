package CombinedOverloading_Overriding;

public class ColorPrinter extends Printer{
    
    @Override
    public void print(String color){
        System.out.println("Color: "+color);
    }
    void printer(Double d){
        System.out.println("Double value: "+d);
    }
}
