package corejava.oops.inheritence;

public class B extends A {

    public String name = "Name B";

    public void m3() {
        System.out.println("B [m3]");
    }

    @Override
    public void m2() {
        System.out.println("B [m2]");
    }

    /**
     * if you try to override static method, Java doesn't stop you doing that;
     * but you certainly don't get the same effect as you get for non-static
     * methods. Overriding in Java simply means that the particular method would
     * be called based on the run time type of the object and not on the compile
     * time type of it. Because they are class methods and hence access to them
     * is always resolved during compile time only using the compile time type
     * information.
     * 
     * We can not override a final static
     */
    public static void print() {
        System.out.println("B Print");
    }

    /**
     * We can overload static methods
     * 
     * @param str
     */
    public static void print(final String str) {
        System.out.println("B Print" + str);
    }

    /**
     * We can not override private method. If subclass has a same method as that
     * of super class, it is just having another private method in sub-class.
     * Sub-class doen't know whether there is a method in super class
     */
    private void m11() {
        System.out.println("B [m11]");
    }

    /**
     * We can overload a super class method in sub-class.
     * 
     * @param a
     */
    public void overload(final String a) {
        System.out.println(a);
    }
}
