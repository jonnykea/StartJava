package tasks.thread;

public class BankAccountSynchronized {

    private long balance;
    private final Object lock = new Object();

    public BankAccountSynchronized(long balance) {
        this.balance = balance;
    }

    public void withdraw(long amount) {
        synchronized (lock) {
            System.out.println("Acquired Lock: " + Thread.currentThread());
            long newBalance = balance - amount;
            balance = newBalance;
            System.out.println("Unlocked the lock: " + Thread.currentThread() + "\n");
            System.out.println(balance);
        }
    }

    public synchronized void deposit(long amount) {
        synchronized (lock) {
            System.out.println("Acquired Lock: " + Thread.currentThread());
            long newBalance = balance + amount;
            balance = newBalance;
            System.out.println("Unlocked the lock: " + Thread.currentThread() + "\n");
            System.out.println(balance);
        }
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}