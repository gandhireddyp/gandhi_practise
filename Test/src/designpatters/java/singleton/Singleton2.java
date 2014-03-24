package designpatters.java.singleton;

public class Singleton2 extends SingletonSuper {

    static boolean instance_flag = false;

    public Singleton2() throws SingletonException {
        if (instance_flag) {
            throw new SingletonException("Instance Already exists for Singleton2");
        } else {
            System.out.println("Created new instance for Singleton2");
            instance_flag = true;
        }
    }

    /**
     * Overriding the clone method will avoid the creation of clones of existing
     * object (using clone method), as constructor is not called during the
     * cloning of object. This happens if the super class of singleton
     * implements cloneable interface.
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Error while creating clones as this is singleton class");
    }

}
