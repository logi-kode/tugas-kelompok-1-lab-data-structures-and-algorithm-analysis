package queue;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    private Queue<String> queue = new LinkedList<>();

    public void addCustomer(String name){
        queue.add(name);
        System.out.println(name + " masuk antrean");
    }

    public void serveCustomer(){
        if(queue.isEmpty()){
            System.out.println("Antrean kosong");
        } else {
            System.out.println("Melayani: " + queue.poll());
        }
    }

    public void displayQueue(){
        System.out.println("Daftar Antrean: ");
        int i = 1;

        for(String name : queue){
            System.out.println(i++ + ". " + name);
        }
    }
}
