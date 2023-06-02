package tasks.thread;

import java.util.concurrent.Semaphore;

public class SemExample {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(3);

        Person one = new Person();
        Person two = new Person();
        Person three = new Person();
        Person four = new Person();
        Person five = new Person();
        Person six = new Person();

        one.table = table;
        two.table = table;
        three.table = table;
        four.table = table;
        five.table = table;
        six.table = table;

        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();
    }
}

class Person extends Thread {
    Semaphore table;

    @Override
    public void run() {
        System.out.println(this.getName() + " waiting for the empty table");
        try {
            table.acquire();
            System.out.println(this.getName() + " start to eat at the table");
            sleep(1000);
            System.out.println(this.getName() + " release the table");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
