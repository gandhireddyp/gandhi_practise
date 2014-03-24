package corejava.order_of_execution;

public class Test {

    /***
     * Order of execution 1)In Parent Static Initializer 2)In Child Static
     * Initializer 3)In Parent Constructor 4)In Child Instance Initializer 5)In
     * Child constructor
     * 
     * @param args
     */
    public static void main(final String[] args) {
        final Child child = new Child();
        System.out.println("######################################");
        final Child child1 = new Child();
    }

}
