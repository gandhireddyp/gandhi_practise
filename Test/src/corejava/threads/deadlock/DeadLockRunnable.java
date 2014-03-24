package corejava.threads.deadlock;

public class DeadLockRunnable implements Runnable {

    DeadLockClass lockClass;

    public DeadLockRunnable(final DeadLockClass deadLockClass) {
        lockClass = deadLockClass;
    }

    @Override
    public void run() {
        lockClass.doSomeThing();
    }

}
