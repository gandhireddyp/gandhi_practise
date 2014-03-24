package corejava.threads.deadlock;

/**
 * 1) "What is deadlock ?"
 * 
 * when two or more threads waiting for each other to release lock and get stuck
 * for infinite time , situation is called deadlock . it will only happen in
 * case of multitasking.
 * 
 * 
 * 
 * 2) How do you detect deadlock in Java ?
 * 
 * a.I would look the code if I see nested synchronized block or calling one
 * synchronized method from other or trying to get lock on different object then
 * there is good chance of deadlock if developer is not very careful.
 * 
 * b.other way is to use jconsole , jconsole will show you exactly which threads
 * are get locked and on which object.
 * 
 * 
 * 
 * 3) How to fix deadlock ? or How to avoid deadlock in Java ?
 * 
 * Now there would not be any deadlock because both method is accessing lock on
 * Integer and String object in same order . so if thread A acquires lock on
 * Integer object , thread B will not proceed until thread A releases Integer
 * lock , same way thread A will not be blocked even if thread B holds String
 * lock because now thread B will not expect thread A to release Integer lock to
 * proceed further
 * 
 * 
 * @author pullalarevug
 * 
 */
public class DeadLockTest {

    public static void main(final String[] args) {

    }
}
