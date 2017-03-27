package PrinterQueue;


/**
 * Created by alexander on 2017-03-20.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(); // Skapar en ny skrivare


        try {
            System.out.println(printer.dequeue()); // försöker att dequeuea när det inte finns något
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(printer.printQueue()); //Printer ut kön

        printer.enqueue("hello");//lägger till hello i kön

        System.out.println(printer.printQueue()); // printar ut kön

        printer.enqueue("paper"); // lägger till paper i kön

        System.out.println(printer.printQueue());// printar ut kön

        System.out.println(printer.size()); // printar ut hur många det är kön

        try {//försöker att ta bort den första ur kön.
            System.out.println(printer.dequeue());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(printer.printQueue());// printar ut kön

        System.out.println(printer.size());// printar ut hur många det är kön

        try {//försöker att ta bort den första ur kön.
            System.out.println(printer.dequeue());
        } catch (PrinterQueueEmptyException e) {
            e.printStackTrace();
        }
        System.out.println(printer.printQueue());// printar ut kön

        System.out.println(printer.size()); // printe rhur många det är i kön


    }


}
