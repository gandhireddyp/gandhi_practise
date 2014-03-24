package corejava.threads;

public class ProducerConsumerExample {
    public static void main(final String[] args) {
        final Drop drop = new Drop();
        new Thread(new Producer(drop)).start();
        new Thread(new Consumer(drop)).start();
    }
}
