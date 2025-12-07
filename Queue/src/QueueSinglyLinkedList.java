
class Qnode {
    int data;
    Qnode next;
}

class QueueSinglyLinkedList {
    Qnode front;
    Qnode rear;

    QueueSinglyLinkedList() {
        front = null;
        rear = null;
    }
    class Qnode {
        int data;
        Qnode next;
    }

    class QueueLinkedList {
        Qnode front;
        Qnode rear;

        QueueLinkedList() {
            front = null;
            rear = null;
        }

        public boolean isEmpty() {
            return front == null;
        }

        public void enqueue(int value) {
            Qnode newNode = new Qnode();
            newNode.data = value;
            newNode.next = null;

            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public void dequeue() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
                return;
            }

            front = front.next;

            if (front == null) {
                rear = null;
            }
        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("Queue Underflow");
            } else {
                System.out.println(front.data);
            }
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int value) {
        Qnode newNode = new Qnode();
        newNode.data = value;
        newNode.next = null;

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        front = front.next;

        if (front == null) {
            rear = null;
        }
    }
    public void peek() {
    	if (isEmpty()) {
            System.out.println("Queue Underflow");
    	}else
    	System.out.println(front.data);
    }
}
