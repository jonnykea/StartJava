package tasks.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskExample {
    public static void main(String[] args) throws Exception {
        Callable<Integer> callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws InterruptedException {
        int j = 0;
        for (int i = 0; i < 10; i++, j++) {
            Thread.sleep(500);
        }
        return j;
    }
}