import queue.CustomerQueue;
import stack.TextEditor;

public class Main {
    public static void main(String[] args) {
        System.out.println("============= QUEUE =============");
        CustomerQueue custQueue = new CustomerQueue();

        long start = System.nanoTime();

        custQueue.addCustomer("Prabu");
        custQueue.addCustomer("Ivan");
        custQueue.displayQueue();
        custQueue.serveCustomer();
        custQueue.displayQueue();

        long end = System.nanoTime();

        System.out.println("Waktu antrean: " + (end - start) + " ns");

        System.out.println("\n============= STACK =============");
        TextEditor editor = new TextEditor();

        long startStack = System.nanoTime();

        editor.addText("Selamat");
        editor.addText(" datang");

        editor.showText();

        editor.undo();
        editor.redo();

        long endStack = System.nanoTime();

        System.out.println("Waktu stack: " + (endStack - startStack) + " ns");
    }
}
