package corejava.oops.inheritence;

public class Test {

    public static void main(final String[] args) {

        final A a = new C();

        a.m2();

        B.print();

        final B b = new B();
        System.out.println(b.name);

        final A ab = new B();
        A.print();

        b.overload("abc");
        b.overload(5);

        final ConcreteClass concreteClass = new ConcreteClass(5);
    }
}
