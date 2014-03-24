package designpatters.java.singleton;

public class SingletonSuper implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
