package corejava.threads.deadlock;

public class DeadLockClass {

    String string;
    Integer integer;

    public void doSomeThing() {

        synchronized (string) {
            System.out.println("Aquired lock on String object");
            try {
                Thread.sleep(5000);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (integer) {
            System.out.println("Aquired lock on integer object");
            try {
                Thread.sleep(5000);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void doSomeThingNew() {

        synchronized (integer) {
            System.out.println("Aquired lock on integer object");
            try {
                Thread.sleep(5000);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized (string) {
            System.out.println("Aquired lock on String object");
            try {
                Thread.sleep(5000);
            } catch (final InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
