package corejava.oops.inheritence;

public class A {

    public String name = "Name A";

    public void m1() {
        System.out.println("A [m1]");
    }

    public void m2() {
        System.out.println("A [m2]");
    }

    public static void print() {
        System.out.println("A Print");
    }

    private final void m11() {
        System.out.println("A [m11]");
    }

    public void overload(final int a) {
        System.out.println(a);
    }

    public A() {
        System.out.println("Initializing A");
    }

}
