public class TestLinkedNode {
	public static void main(String[] args) {
		
		node node1 = new node("Alice");
		display(1, node1);
		
		System.out.println();
		
		node node2 = new node(25);
		display(2, node2);
		
		System.out.println();
		node node3 = new node(true);
		display(3 ,node3);
		
		System.out.println();
		node node4 = new node(17.5);
		display(4, node4);
		
		node1.next = node2;
		System.out.println();
		display(1, node1);
		
		node2.next = node3;
		node3.next = node4;
		
		display(2, node2);
		display(3, node3);
		display(4, node4);
		
		System.out.println(node1.next.data);
		
		}
        
	public static void display(int num_node, node node) {
		System.out.println("node " + num_node + "data = " + node.data);
		System.out.println("node " + num_node + "address = "+ node.getAddress(node));
		System.out.println("node " + num_node + " pointer addtess => " + node.getAddress(node.next));
	}
	
	
}
