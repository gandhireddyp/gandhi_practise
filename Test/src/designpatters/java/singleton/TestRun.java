package designpatters.java.singleton;

/**
 * According to the definition the singleton pattern should be used when there
 * must be exactly one instance of a class, and when it must be accessible to
 * clients from a global access point. Here are some real situations where the
 * singleton is used:
 * 
 * 
 * 
 * Example 1 - Logger Classes
 * 
 * The Singleton pattern is used in the design of logger classes. This classes
 * are ussualy implemented as a singletons, and provides a global logging access
 * point in all the application components without being necessary to create an
 * object each time a logging operations is performed.
 * 
 * 
 * 
 * Example 2 - Configuration Classes
 * 
 * The Singleton pattern is used to design the classes which provides the
 * configuration settings for an application. By implementing configuration
 * classes as Singleton not only that we provide a global access point, but we
 * also keep the instance we use as a cache object. When the class is
 * instantiated( or when a value is read ) the singleton will keep the values in
 * its internal structure. If the values are read from the database or from
 * files this avoids the reloading the values each time the configuration
 * parameters are used.
 * 
 * 
 * 
 * Example 3 - Accesing resources in shared mode
 * 
 * It can be used in the design of an application that needs to work with the
 * serial port. Let's say that there are many classes in the application,
 * working in an multi-threading environment, which needs to operate actions on
 * the serial port. In this case a singleton with synchronized methods could be
 * used to be used to manage all the operations on the serial port.
 * 
 * 
 * @author pullalarevug
 * 
 */
public class TestRun {

    public static void main(final String[] args) throws InstantiationException, IllegalAccessException,
            ClassNotFoundException, CloneNotSupportedException {

        // Eager initialization
        final SingletonEager eager1 = SingletonEager.getInstance();
        final SingletonEager eager2 = SingletonEager.getInstance();
        System.out.println("is Eager Initialized " + (eager1 == eager2));

        testUsingCalssForname();
        testUsingClone();
        testUsingReflection();
        testUsingNewOperator();

    }

    private static void testUsingNewOperator() {
        System.out.println("testUsingNewOperator - start");
        Singleton1.getInstance();
        Singleton1.getInstance();
        new Singleton2();
        new Singleton2();
        System.out.println("testUsingNewOperator - end");
    }

    private static void testUsingClone() {
        System.out.println("testUsingClone - start");
        final Singleton1 singleton1 = Singleton1.getInstance();
        final Singleton2 singleton2 = new Singleton2();
        try {
            singleton1.clone();
            singleton2.clone();
        } catch (final CloneNotSupportedException e) {
            e.printStackTrace();
        } catch (final SingletonException e) {
            e.printStackTrace();
        }
        System.out.println("testUsingClone - end");
    }

    private static void testUsingReflection() {
        System.out.println("testUsingReflection - start");
        Singleton1.getInstance();
        new Singleton2();
        try {
            Singleton1.class.newInstance();
            Singleton2.class.newInstance();
        } catch (final InstantiationException e) {
            e.printStackTrace();
        } catch (final IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("testUsingReflection - end");
    }

    private static void testUsingCalssForname() {
        System.out.println("testUsingCalssForname - start");
        Singleton1.getInstance();
        new Singleton2();
        try {
            Class.forName("designpatters.java.singleton.Singleton1").newInstance();
            Class.forName("designpatters.java.singleton.Singleton2").newInstance();
        } catch (final InstantiationException e) {
            e.printStackTrace();
        } catch (final IllegalAccessException e) {
            e.printStackTrace();
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("testUsingCalssForname - end");
    }

}
