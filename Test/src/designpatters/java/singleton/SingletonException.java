package designpatters.java.singleton;

public class SingletonException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public SingletonException() {
        super();
    }

    public SingletonException(final String s) {
        super(s);
    }
}
