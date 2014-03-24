package corejava.oops.inheritence;

public class Class1 implements I1, I2 {

    @Override
    public int add(final int i1, final int i2) {
        return i1 + i2;
    }

    public static void main(final String[] args) {

        final I1 class1 = new Class1();
        System.out.println(class1.add(2, 3));

        final I2 class2 = new Class1();
        System.out.println(class2.add(2, 3));
    }

}
