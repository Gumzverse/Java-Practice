class DNode {
    int data;
    DNode next;
    DNode prev;

    DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class StackDoublyLinkedList {
    private DNode top;

    public StackDoublyLinkedList() {
        this.top = null;
    }
    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        DNode newNode = new DNode(value);
        if (top != null) {
            newNode.prev = top;
            top.next = newNode;
        }
        top = newNode;
        System.out.println(value + " pushed to stack.");
    }

    public void pop() {
        if (isEmpty())
            System.out.println("Stack Underflow!");
        else {
            System.out.println(top.data + " popped from stack.");
            top = top.prev;
            if (top != null) top.next = null;
        }
    }

    public void peek() {
        if (isEmpty())
            System.out.println("Stack is empty!");
        else
            System.out.println("Top element: " + top.data);
    }

    public void display() {
        if (isEmpty())
            System.out.println("Stack is empty!");
        else {
            System.out.print("Stack elements: ");
            DNode current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.prev;
            }
            System.out.println();
        }
    }

    public int search(int value) {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        DNode current = top;
        int pos = 1;
        while (current != null) {
            if (current.data == value) {
                System.out.println(value + " found at position " + pos + " from the top.");
                return pos;
            }
            current = current.prev;
            pos++;
        }
        System.out.println(value + " not found in stack.");
        return -1;
    }
}
