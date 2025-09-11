package CombinedOverloading_Overriding;

public class Main {
    public static void main(String[] args) {
        Printer parent= new Printer();
        parent.print(100);
        parent.print("Hello World");
        Printer ch= new ColorPrinter();
        ch.print("Red");
        ch.print(200);
        ColorPrinter c= (ColorPrinter)ch;
        c.printer(null);
    }
}
