package corejava.order_of_execution;

public class Child extends Parent {

    static {
        System.out.println("In Child Static Initializer");
    }

    {
        System.out.println("In Child Instance Initializer");
    }

    public Child() {
        System.out.println("In Child constructor");
    }
}
