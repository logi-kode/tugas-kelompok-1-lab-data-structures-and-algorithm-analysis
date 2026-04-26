import queue.CustomerQueue;

public class Main {
    public static void main(String[] args) {
        CustomerQueue custQueue = new CustomerQueue();

        long start = System.nanoTime();

        custQueue.addCustomer("Prabu");
        custQueue.addCustomer("Ivan");
        custQueue.displayQueue();
        custQueue.serveCustomer();
        custQueue.displayQueue();

        long end = System.nanoTime();

        System.out.println("Waktu antrean: " + (end - start) + " ns");
    }
}
