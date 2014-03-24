package corejava.threads;

import java.util.Random;

public class Consumer implements Runnable {
    private final Drop drop;

    public Consumer(final Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        final Random random = new Random();
        for (String message = drop.take(); !message.equals("DONE"); message = drop.take()) {
            System.out.format("MESSAGE RECEIVED: %s%n", message);
        }
    }
}