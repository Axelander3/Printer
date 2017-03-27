package PrinterQueue;

/**
 * Created by alexander on 2017-03-20.
 */
public class Printer {

    private LinkedList queue; // skapar en lista

    public Printer() { // gör själva listan i konstrukotrn
        queue = new LinkedList<String>();
    }

    public void enqueue(String data) { // lägger till något i kön
        queue.addLast(data);
    }

    public String dequeue() throws PrinterQueueEmptyException { //  tar bort något i kön och ger tillbaka det som togs bort.
        String first = queue.getFirst();
        queue.removeFirst();
        return first;
    }

    public int size() { // ger hur många det är i kön
        return queue.size();
    }

    public boolean isEmpty() {// returnar om queuen är top
        return queue.isEmpty();
    }

    public String printQueue() { // skriver ut kön
        return queue.toString();
    }

}
