import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Clock implements Runnable {


    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(LocalDateTime.now().format(dateTimeFormatter));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("El hilo secundario ya ha terminado de ejecutarse");
                return;
            }
        }
        System.out.println("El hilo secundario ha sido interrumpido");
    }
}
