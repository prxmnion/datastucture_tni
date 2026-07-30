public class StackArrayBased {
    private int[] stacks;
    private final int MAX_STACK = 50;
    private int top;

    public StackArrayBased() {
        stacks = new int[MAX_STACK];
        top = -1;
    }

    public StackArrayBased(int capacity) {
        stacks = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;

    }

    public boolean isFull() {
        if (top == stacks.length-1) {
            return true;
        }
        return false;
    }

    public boolean push(int new_element) {
        if (!isFull()) {
            top++;
            stacks[top] = new_element;
            return true;
        }
        return false;
    }

    public int peek() {
        if (!isEmpty()) {
            return stacks[top];
        }
        return -1;
    }

    public int pop() {
        if (!isEmpty()) {
            int top_element = stacks[top];
            top--;
            return top_element;
        }
        return -1;
    }

    public void popAll() {
        stacks = new int[MAX_STACK];
        top = -1;
    }

}

