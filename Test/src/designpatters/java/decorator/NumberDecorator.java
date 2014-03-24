package designpatters.java.decorator;

public class NumberDecorator implements INumber {

    private final INumber number;

    public NumberDecorator(final INumber number) {
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Logging the number");
        number.print();
    }

}
