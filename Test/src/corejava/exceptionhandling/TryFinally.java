package corejava.exceptionhandling;

public class TryFinally {

    /**
     * If try block throws an exception and finally block returns a value,
     * Exception will never be thrown
     * 
     * @param args
     */
    public static void main(final String[] args) {

        System.out.println(getInteger());
    }

    private static int getInteger() {
        try {
            throw new NullPointerException();
        } finally {
            return 1;
        }

    }
}
