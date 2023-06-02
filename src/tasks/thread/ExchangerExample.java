package tasks.thread;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) throws InterruptedException{
        Exchanger<String> exchanger = new Exchanger<>();

        new FormForPrint(exchanger);
        new Mike(exchanger);

    }

    static class Mike extends Thread {
        Exchanger<String> exchanger;
        public Mike(Exchanger<String> exchanger) {
            this.exchanger = exchanger;
            start();
        }
        @Override
        public void run() {
            try {
                exchanger.exchange("Hello my name is Mike");
                sleep(3000);
                exchanger.exchange("What is your name?");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class FormForPrint extends Thread {
        Exchanger<String> exchanger;

        public FormForPrint(Exchanger<String> exchanger){
            this.exchanger = exchanger;
            start();
        }

        @Override
        public void run() {
            try {
                System.out.println(exchanger.exchange(null));
                System.out.println(exchanger.exchange(null));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}