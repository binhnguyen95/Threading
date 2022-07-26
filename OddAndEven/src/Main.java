public class Main {
    public static void main(String[] args) throws InterruptedException {
        OddThread odd = new OddThread(10);
        Thread thread1 = new Thread(odd);

        EvenThread even = new EvenThread(10);
        Thread thread2 = new Thread(even);

        thread1.start();
        thread1.join();
        thread2.start();
    }
}
