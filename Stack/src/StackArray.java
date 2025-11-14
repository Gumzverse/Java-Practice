public class StackArray {
    private int[] stack;
    private int top;
    private int size;

    public StackArray(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    
	public boolean isEmpty() {
	    return top == -1;
	}
	
	public boolean isFull() {
	    return top == size - 1;
	}

    public void push(int value) {
        if (isFull())
            System.out.println("Stack Overflow!");
        else {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    public void pop() {
        if (isEmpty())
            System.out.println("Stack Underflow!");
        else
            System.out.println(stack[top--] + " popped from stack.");
    }

    public void peek() {
        if (isEmpty())
            System.out.println("Stack is empty!");
        else
            System.out.println("Top element: " + stack[top]);
    }

    public void display() {
        if (isEmpty())
            System.out.println("Stack is empty!");
        else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }

    public int search(int value) {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        for (int i = top, pos = 1; i >= 0; i--, pos++) {
            if (stack[i] == value) {
                System.out.println(value + " found at position " + pos + " from the top.");
                return pos;
            }
        }
        System.out.println(value + " not found in stack.");
        return -1;
    }
}

