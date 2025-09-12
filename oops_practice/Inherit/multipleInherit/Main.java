package oops_practice.Inherit.multipleInherit;

public class Main {
    public static void main(String[] args) {
        IParent1 child1 = new ChildImpl();
        IParent2 child2 = new ChildImpl();
        child1.m1();
        child2.m1();
        // child2.m2();

    }
    
}
