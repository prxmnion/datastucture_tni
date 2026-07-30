public class StackLinkedList {

    private Node top;

    public StackLinkedList() {
        top = null;
    }

    public boolean isEmpty() {
        if (top == null) {
            return true;
        }
        return false;
    }

    public void push(int value) {
        Node new_node = new Node(value);
        if (isEmpty()) {
            top = new_node;
        }else {
            new_node.next = top;
            top = new_node;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            Node temp_node = top;
            int temp_data = temp_node.data;
            top = top.next;
            temp_node = null;
            return temp_data;
        }
    }

    public void popAll() {
        top = null;
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            return -1;
        }

    }
}