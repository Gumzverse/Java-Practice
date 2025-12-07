class QueueArray {
    int[] queue;
    int front;
    int rear;
    int size;

    QueueArray(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // FIXED: linear queue is full when rear reaches end
    public boolean isFull() {
        return rear == queue.length - 1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        rear++;
        queue[rear] = value;
        size++;
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        front++;
        size--;

        if (size == 0) {
            front = 0;
            rear = -1;
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front]);
        }
    }
}
