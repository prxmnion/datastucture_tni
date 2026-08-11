
public class QueueTest {

	public static void main(String[] args) {
		
		//QueueArrayBased queue = new QueueArrayBased();
		QueueLinkedList queue = new  QueueLinkedList();
		
		queue.enqueue(10);
		queue.enqueue(11);
		
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        
	}

}
