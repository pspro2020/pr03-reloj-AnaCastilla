public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread clock = new Thread(new Clock());
        clock.start();
        Thread.currentThread();
        Thread.sleep(12000);
        clock.interrupt();
    }
}
