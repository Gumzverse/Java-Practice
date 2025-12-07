public class Main {

    public static void main(String[] args) {

        System.out.println("\n=====================================");
        System.out.println(" QUEUE IMPLEMENTATION USING SINGLY LINKED LIST ");
        System.out.println("=====================================");
        QueueSinglyLinkedList Q1 = new QueueSinglyLinkedList();
        Q1.enqueue(1);
        Q1.enqueue(12);
        Q1.dequeue();
        Q1.dequeue();
        Q1.dequeue();  // underflow
        Q1.dequeue();  // underflowingly
        Q1.peek();     // empty -> underflow
        Q1.enqueue(14);
        Q1.enqueue(17);
        Q1.peek();     // prints 14

        System.out.println("\n=====================================");
        System.out.println(" QUEUE IMPLEMENTATION USING ARRAY ");
        System.out.println("=====================================");
        QueueArray Q = new QueueArray(5);

        Q.enqueue(10);
        Q.enqueue(20);
        Q.enqueue(30);
        Q.peek(); // 10
        Q.dequeue();  // removes 10
        Q.peek();    // 20
        Q.enqueue(40);
        Q.enqueue(50);
        Q.enqueue(60); // fill queue
        Q.enqueue(70); // Overflow
        Q.peek();      // 60
        Q.dequeue();
        Q.peek();      // 30
    }
}