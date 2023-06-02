package tasks.thread;

public class BankAccountTest {

    public static void main(String[] args) throws InterruptedException {
        BankAccountSynchronized ba = new BankAccountSynchronized(0);
        var t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                ba.deposit(100);
            }
        });

        var t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                ba.withdraw(100);
            }
        });

        t1.start();
//        Thread.sleep(500);
        t2.start();

 /*       t1.join();
        t2.join();    The join method allows one thread to wait for the completion of another.
        If t is a Thread object whose thread is currently executing
        join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.*/

        System.out.println(ba);
    }
}
