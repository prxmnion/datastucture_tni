import java.util.Queue;

public class QueueLinkedList {

	// pointer of the front and rear node
	private Node front;
	private Node rear;
	
	// create an empty queue
	public QueueLinkedList() {
		front = null;
		rear  = null;
	}
	
	public boolean isEmpty() {
		if (front == null) {
			return true;
		}
         return false;
	}
	
	public void enqueue(int value) {
        Node new_node = new Node(value);
        if (isEmpty() == true) {
        	front = new_node;
        	rear = new_node;
        }else {
        	rear.next = new_node;
        	rear = new_node;
        }
	}
	
	public int peek() {
        if (isEmpty() == false) {
        	return front.data;
        }
        return -1;
	}
	
	public int dequeue() {
        if (isEmpty() == false) {
        	Node temp_node = front;     //back 
        	int temp_data = temp_node.data;
        	
        	front = front.next;
        	
        	temp_node = null;
        	
        }
		return -1;
	}
	
}

