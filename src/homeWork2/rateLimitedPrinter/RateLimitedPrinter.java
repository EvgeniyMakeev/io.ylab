package homeWork2.rateLimitedPrinter;

public class RateLimitedPrinter {
    private final int interval;
    long timeOfLastMessage = 0;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
    }

    public void print(String message) {
        if ((System.currentTimeMillis() - interval) >= timeOfLastMessage) {
            timeOfLastMessage = System.currentTimeMillis();
            System.out.println(message);
        }
    }
}
