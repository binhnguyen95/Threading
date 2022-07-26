public class EvenThread implements Runnable {
    private int numEven;

    public EvenThread(int numEven) {
        this.numEven = numEven;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < numEven; i++) {
                if (i % 2 == 0 && i != 0) {
                    System.out.println("Even " + i);
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
