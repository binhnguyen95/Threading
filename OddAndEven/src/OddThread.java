public class OddThread implements Runnable {
    private int numOdd;

    public OddThread(int numOdd) {
        this.numOdd = numOdd;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < numOdd; i++) {
                if (i % 3 == 0 && i != 0) {
                    System.out.println("Odd " + i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
