package lesson_04;

public class ATMMain {
    public static void main(String[] args) throws InterruptedException {
        ATM atm = new ATM(100);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.takeMoney(50, "Adil");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.takeMoney(50, "Askhat");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.takeMoney(50, "Dias");
            }
        });

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        atm.info();
    }
}
