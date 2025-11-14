class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
	public class StackLinkedList {
    private Node top;

    public StackLinkedList() {
        this.top = null;
    }
    public boolean isEmpty() {
	    return top == null;
	}

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack.");
    }

    public void pop() {
        if (isEmpty())
            System.out.println("Stack Underflow!");
        else {
            System.out.println(top.data + " popped from stack.");
            top = top.next;
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
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public int search(int value) {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }

        Node current = top;
        int pos = 1;
        while (current != null) {
            if (current.data == value) {
                System.out.println(value + " found at position " + pos + " from the top.");
                return pos;
            }
            current = current.next;
            pos++;
        }
        System.out.println(value + " not found in stack.");
        return -1;
    }
}
