package PrinterQueue;

/**
 * Created by alexander on 2017-03-20.
 */

public class LinkedList<E> {

    private Node first;
    private Node last;
    private int size;

    private class Node {
        E data;
        Node next;

        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public LinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    public void addFirst(E item) {
        Node tempNode = new Node(item, null);
        if (isEmpty()) {
            this.first = tempNode;
            this.last = tempNode;
            size++;
        } else {
            Node n = this.first.next;
            this.first = new Node(item, n);
            size++;
        }

        size++;
    }

    public void addLast(E item) {
        Node tempNode = new Node(item, null);
        if (isEmpty()) {
            this.first = tempNode;
            this.last = tempNode;
            size++;
        } else {
            this.last.next = tempNode;
            this.last = tempNode;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            // thorw new exeption
            return;
        } else {
            if (size() == 1) {
                this.first = null;
                this.last = null;
                size--;
            } else {
                this.first = this.first.next;
                size--;
            }
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            // thorw new exeption
            return;
        } else {
            this.last = null;
            size--;
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if(this.size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        String print = "";
        Node currentNode = first;
        while(currentNode != null) {
            print += currentNode.data.toString();
            currentNode = currentNode.next;
            if (currentNode != null) {
                print += " -> ";
            }
        }
        return print;
    }
    public String getFirst() {
        return this.first.data.toString();
    }
}

