package tasks.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
    private final BlockingQueue<String> drop;

    private final String DONE = "done";
    private final String[] messages = {
            "Мама пошла готовить обед",
            "Мама позвала к столу",
            "Дети кушают молочную кашу",
            "А что ест папа?"};

    public BlockingQueueExample() {
        drop = new ArrayBlockingQueue<>(1, true);
        (new Thread(new Producer())).start();
        (new Thread(new Consumer())).start();
    }

    class Producer implements Runnable {
        public void run() {
            try {
                int count = 0;
                for (String message : messages) {
                    drop.put(message);
                    if (++count < 3)
                        Thread.sleep(2000);
                }
                drop.put(DONE);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    class Consumer implements Runnable {
        public void run() {
            try {
                String msg = null;
                while (!((msg = drop.take()).equals(DONE)))
                    System.out.println(msg);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new BlockingQueueExample();
    }
}
