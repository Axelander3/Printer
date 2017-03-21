package PrinterQueue;


/**
 * Created by alexander on 2017-03-20.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.enqueue("test");

        System.out.println(printer.printQueue());

        printer.enqueue("hello");

        System.out.println(printer.printQueue());

        printer.enqueue("paper");

        System.out.println(printer.printQueue());

        System.out.println(printer.size());

        System.out.println(printer.dequeue());

        System.out.println(printer.printQueue());

        System.out.println(printer.size());
    }

}
