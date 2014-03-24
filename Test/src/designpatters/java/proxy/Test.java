package designpatters.java.proxy;

/**
 * The Proxy pattern is used when you need to represent a complex object by a
 * simpler one. If creating an object is expensive in time or computer
 * resources, Proxy allows you to postpone this creation until you need the
 * actual object. A Proxy usually has the same methods as the object it
 * represents, and once the object is loaded, it passes on the method calls from
 * the Proxy to the actual object.
 * 
 * There are several cases where a Proxy can be useful: 1. If an object, such as
 * a large image, takes a long time to load. 2. If the object is on a remote
 * machine and loading it over the network may be slow, especially during peak
 * network load periods. 3. If the object has limited access rights, the proxy
 * can validate the access permissions for that user.
 * 
 * 
 * Common Situations where the proxy pattern is applicable are:
 * 
 * Virtual Proxies: delaying the creation and initialization of expensive
 * objects until needed, where the objects are created on demand (For example
 * creating the RealSubject object only when the doSomething method is invoked).
 * 
 * Remote Proxies: providing a local representation for an object that is in a
 * different address space. A common example is Java RMI stub objects. The stub
 * object acts as a proxy where invoking methods on the stub would cause the
 * stub to communicate and invoke methods on a remote object (called skeleton)
 * found on a different machine.
 * 
 * Protection Proxies: where a proxy controls access to RealSubject methods, by
 * giving access to some objects while denying access to others.
 * 
 * Smart References: providing a sophisticated access to certain objects such as
 * tracking the number of references to an object and denying access if a
 * certain number is reached, as well as loading an object from database into
 * memory on demand.
 * 
 * @author pullalarevug
 * 
 */
public class Test {

    public static void main(final String[] args) {

        // assuming that the user selects a folder that has 3 images
        // create the 3 images
        final Image highResolutionImage1 = new ImageProxy("sample/veryHighResPhoto1.jpeg");
        final Image highResolutionImage2 = new ImageProxy("sample/veryHighResPhoto2.jpeg");
        final Image highResolutionImage3 = new ImageProxy("sample/veryHighResPhoto3.jpeg");

        // assume that the user clicks on Image one item in a list
        // this would cause the program to call showImage() for that image only
        // note that in this case only image one was loaded into memory
        highResolutionImage1.showImage();

        // consider using the high resolution image object directly
        final Image highResolutionImageNoProxy1 = new HighResolutionImage("sample/veryHighResPhoto1.jpeg");
        final Image highResolutionImageNoProxy2 = new HighResolutionImage("sample/veryHighResPhoto2.jpeg");
        final Image highResolutionImageBoProxy3 = new HighResolutionImage("sample/veryHighResPhoto3.jpeg");

        // assume that the user selects image two item from images list
        highResolutionImageNoProxy2.showImage();

        // note that in this case all images have been loaded into memory
        // and not all have been actually displayed
        // this is a waste of memory resources

    }

}
