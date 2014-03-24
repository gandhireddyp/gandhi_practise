package corejava.oops.inheritence;

public class ConcreteClass extends AbstractClass {

    int i = 1;
    A a = new A();

    public ConcreteClass(final int i) {
        System.out.println("Setting i=" + i);
        this.i = i;
    }

    @Override
    public void print() {
        System.out.println("HI " + i);
    }

}
