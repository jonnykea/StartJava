package tasks.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadCondition {
    static Lock lock = new ReentrantLock();
    static Condition condition = lock.newCondition();
    static int account = 0;

    public static void main(String[] args) throws InterruptedException {
        new AccountMinus().start();
        new AccountPlus().start();
/*        for (int i = 0; i < 10; i++) {
            new AccountMinus().start();
            Thread.sleep(10);
            new AccountPlus().start();
//        if turn place Minus and Plus threads so account doesn't increment
        }*/
    }

    static class AccountPlus extends Thread {
        @Override
        public void run() {
            lock.lock();
            account += 10;
            System.out.println("account is increased = " + account);
            condition.signal();
            lock.unlock();
        }
    }

    static class AccountMinus extends Thread {
        @Override
        public void run() {
            if (account < 10) {
                try {
                    lock.lock();
                    System.out.println("account = " + account);
                    condition.await();
                    System.out.println("account = " + account);
                    lock.unlock();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account -= 10;
                System.out.println("account at the end = " + account);
            }
        }
    }
}
