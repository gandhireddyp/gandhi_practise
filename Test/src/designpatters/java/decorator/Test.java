package designpatters.java.decorator;

/**
 * Extending an objects functionality can be done statically (at compile time)
 * by using inheritance however it might be necessary to extend an objects
 * functionality dynamically (at runtime) as an object is used.
 * 
 * The intent of this pattern is to add additional responsibilities dynamically
 * to an object.
 * 
 * Decoration is more convenient for adding functionalities to objects instead
 * of entire classes at runtime. With decoration it is also possible to remove
 * the added functionalities dynamically.
 * 
 * Decoration adds functionality to objects at runtime which would make
 * debugging system functionality harder.
 * 
 * 
 * 
 * @author pullalarevug
 * 
 */
public class Test {

    public static void main(final String[] args) {
        final INumber number = new Number();
        number.print();

        final INumber decoratedNumber = new NumberDecorator(number);
        decoratedNumber.print();
    }
}
