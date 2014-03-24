package corejava.threads;


/**
 * here is list of difference between wait and sleep in Java :

1) wait is called from synchronized context only while sleep can be called 
without synchronized block. see Why wait and notify needs to call from synchronized 
method for more detail.

2) wait is called on Object while sleep is called on Thread. 

3) waiting thread can be awake by calling notify and notifyAll while sleeping thread 
can not be awaken by calling notify method.

4) wait is normally done on condition, Thread wait until a condition is true 
while sleep is just to put your thread on sleep.

5) wait release lock on object while waiting while sleep doesn’t release lock while waiting.

 * 
 * 
 * 
 * @author pullalarevug
 *
 */

public class WaitNotify {
	
	public static void main(String[] args) {
		
	}

}
