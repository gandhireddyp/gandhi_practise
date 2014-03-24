package designpatters.java.singleton;

public class SingletonDoubleLocking {

    /**
     * Example 1 - Logger Classes The Singleton pattern is used in the design of
     * logger classes. This classes are usually implemented as a singletons, and
     * provides a global logging access point in all the application components
     * without being necessary to create an object each time a logging
     * operations is performed.
     * 
     * Example 2 - Configuration Classes The Singleton pattern is used to design
     * the classes which provides the configuration settings for an application.
     * By implementing configuration classes as Singleton not only that we
     * provide a global access point, but we also keep the instance we use as a
     * cache object. When the class is instantiated( or when a value is read )
     * the singleton will keep the values in its internal structure. If the
     * values are read from the database or from files this avoids the reloading
     * the values each time the configuration parameters are used.
     * 
     * Example 3 - Factories implemented as Singletons Let's assume that we
     * design an application with a factory to generate new objects (Acount,
     * Customer, Site, Address objects) with their ids, in an multithreading
     * environment. If the factory is instantiated twice in 2 different threads
     * then is possible to have 2 overlapping ids for 2 different objects. If we
     * implement the Factory as a singleton we avoid this problem. Combining
     * Abstract Factory or Factory Method and Singleton design patterns is a
     * common practice.
     * 
     * 
     */
    private static SingletonDoubleLocking singletonDoubleLocking;

    private SingletonDoubleLocking() {
    	
    	//this is to avoid the object creation using reflection
    	if(singletonDoubleLocking != null)
    	{
    		throw new SingletonException();
    	}

    }

    public SingletonDoubleLocking getInstance() {
        if (singletonDoubleLocking == null) {
            synchronized (SingletonDoubleLocking.class) {
                if (singletonDoubleLocking == null) {
                    singletonDoubleLocking = new SingletonDoubleLocking();
                }
            }
        }
        return singletonDoubleLocking;
    }

    /**
     * If the Singleton class implements the java.io.Serializable interface,
     * when a singleton is serialized and then deserialized more than once,
     * there will be multiple instances of Singleton created.
     * 
     * Serialization - When Singletons are implementing Serializable interface
     * they have to implement readResolve method in order to avoid having 2
     * different objects.
     * 
     * The readResolve method is called when ObjectInputStream has read an
     * object from the stream and is preparing to return it to the caller.
     * ObjectInputStream checks whether the class of the object defines the
     * readResolve method. If the method is defined, the readResolve method is
     * called to allow the object in the stream to designate the object to be
     * returned.
     * */
    protected Object readResolve() {
        return getInstance();
    }

}
