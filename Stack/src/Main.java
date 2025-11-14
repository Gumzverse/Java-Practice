public class Main {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" STACK IMPLEMENTATION USING ARRAY ");
        System.out.println("=====================================");
        StackArray arrayStack = new StackArray(5);
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.search(10);
        arrayStack.display();
        arrayStack.peek();
        arrayStack.pop();
        arrayStack.display();
        arrayStack.pop();
        arrayStack.pop();
        arrayStack.pop(); // underflow test
        arrayStack.pop();
        arrayStack.display();

        System.out.println("\n=====================================");
        System.out.println(" STACK IMPLEMENTATION USING SINGLY LINKED LIST ");
        System.out.println("=====================================");
        StackLinkedList linkedStack = new StackLinkedList();
        linkedStack.push(100);
        linkedStack.push(10);
        linkedStack.push(1);
        linkedStack.search(2);
        linkedStack.display();
        linkedStack.peek();
        linkedStack.pop();
        linkedStack.display();
        linkedStack.pop();
        linkedStack.pop();
        linkedStack.pop(); // underflow test
        linkedStack.display();

        System.out.println("\n=====================================");
        System.out.println(" STACK IMPLEMENTATION USING DOUBLY LINKED LIST ");
        System.out.println("=====================================");
        StackDoublyLinkedList doublyStack = new StackDoublyLinkedList();
        doublyStack.push(1);
        doublyStack.push(2);
        doublyStack.push(3);
        doublyStack.search(1+1);
        doublyStack.display();
        doublyStack.peek();
        doublyStack.pop();
        doublyStack.display();
        doublyStack.pop();
        doublyStack.pop();
        doublyStack.pop(); // underflow test
        doublyStack.display();
    }
}
