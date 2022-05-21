package lesson_04;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter = new Counter(0);

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1_000_000; i++) {
                counter.incC();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1_000_000; i++) {
                counter.decC();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Counter = " + counter.getC());
    }
}
