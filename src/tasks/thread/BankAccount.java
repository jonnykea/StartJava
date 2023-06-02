package tasks.thread;

import java.util.concurrent.atomic.AtomicLong;

public class BankAccount {
//    private volatile long balance;  volatile forbid threads to do a cash (not effective way)
//    private long balance ;

    private AtomicLong balance = new AtomicLong(0);

    public BankAccount(AtomicLong balance) {
        this.balance = balance;
    }

    public void withdraw(long amount) {
//        long newBalance = balance - amount;
        AtomicLong newBalance = new AtomicLong(balance.get() - amount);
        balance = newBalance;
    }

    public void deposit(long amount) {
//        long newBalance = balance + amount;
        AtomicLong newBalance = new AtomicLong(balance.get() + amount);
        balance = newBalance;
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
