package corejava.order_of_execution;

public class Parent {

    public Parent() {
        System.out.println("In Parent Constructor");
    }

    static {
        System.out.println("In Parent Static Initializer");
    }

    {
        System.out.println("In Parent Instance Initializer");
    }

}
