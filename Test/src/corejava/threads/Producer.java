package corejava.threads;

import java.util.Random;

public class Producer implements Runnable {
    private final Drop drop;

    public Producer(final Drop drop) {
        this.drop = drop;
    }

    @Override
    public void run() {
        final String importantInfo[] = {"Mares eat oats", "Does eat oats", "Little lambs eat ivy",
                "A kid will eat ivy too"};
        final Random random = new Random();

        for (final String element : importantInfo) {
            drop.put(element);

        }
        drop.put("DONE");
    }
}