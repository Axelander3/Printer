package PrinterQueue;

/**
 * Created by alexander on 2017-03-20.
 */
public class Printer {

    LinkedList queue;

    public Printer() {
        queue = new LinkedList<String>();
    }

    public void enqueue(String data) {
        queue.addLast(data);
    }

    public String dequeue() {
        String first = queue.getFirst();
        queue.removeFirst();
        return first;
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public String printQueue() {
        return queue.toString();
    }

}
