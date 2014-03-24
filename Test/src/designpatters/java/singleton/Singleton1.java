package designpatters.java.singleton;

public class Singleton1 extends SingletonSuper {

    static Singleton1 singleton1;

    // Private Constructor
    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
            System.out.println("Created New object For Singleton1");
            return singleton1;
        } else {
            System.out.println("returned old object For Singleton1");
            return singleton1;
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
        throw new CloneNotSupportedException(
                "Error while creating clones for \"Singleton1\" as this is singleton class");
    }
    
    /** 
	 * If the Singleton class implements the java.io.Serializable interface, 
	 * when a singleton is serialized and then deserialized more than once, 
	 * there will be multiple instances of Singleton created. 
	 * 
	 * Serialization - When Singletons are implementing Serializable interface they have to 
	 * implement readResolve method in order to avoid having 2 different objects.
	 * 
	 * The readResolve method is called when ObjectInputStream has read an object 
	 * from the stream and is preparing to return it to the caller. 
	 * ObjectInputStream checks whether the class of the object defines the readResolve method. 
	 * If the method is defined, the readResolve method is called to allow the object in 
	 * the stream to designate the object to be returned.
	 * */
	protected Object readResolve() {
		return getInstance();
	}
}
