package oops_practice.Inherit.multipleInherit;

public class ChildImpl implements IParent1, IParent2 {
    @Override
    public void m1() {
        System.out.println("Method m1 called from ChildImpl");
    }

    // @Override
    // public void m2() {
    //     System.out.println("Method m2 from IParent2");
    // }
}
