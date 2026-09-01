import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Queue;

public class TraversePostorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree1();    // Try to test with createTree2() and createTree3()
		tree.printTree(tree.getRoot(), 0);
		System.out.println();
		System.out.println("Postorder = " + traversal(tree.getRoot()));
	}

	public static ArrayList<Integer> traversal(Node node) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Deque<Node> stack = new ArrayDeque<Node>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		stack.push(node);
		
		while (!stack.isEmpty()) {
			Node current_node = stack.pop();
			queue.offer(current_node.data);    //เก็บใน queue
			
			
			if (current_node.left != null) {   // เช็คขวาใส่ซ้าย โฟกัสตัวไหน สลับตัวนั้น
				stack.push(current_node.left);
				
			}
            if (current_node.right != null) {
            	stack.push(current_node.right);
            	
            }
        
         while (!queue.isEmpty()) {
            list.addFirst(queue.poll());
        	 
               }
              }
		
		return list;
     }
}

