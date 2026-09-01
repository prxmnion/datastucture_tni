import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

	public Node root;
	public Node parent;
	public Node deleteNode;
	public Node searchNode;
	
	
	
	public Node getSearchNode() {
		return searchNode;
	}
	
	public BinaryTree() {
		root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}

	public void createTree1() {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
	}

	public void createTree2() {
		root = new Node(15);
		root.left = new Node(8);
		root.right = new Node(23);
		root.left.left = new Node(4);
		root.left.right = new Node(11);
		root.right.left = new Node(19);
		root.left.left.left = new Node(2);
		root.right.left.right = new Node(20);
	}

	public void createTree3() {
		root = new Node(50);
		root.left = new Node(10);
		root.right = new Node(22);
		root.left.left = new Node(11);
		root.left.right = new Node(12);
		root.right.right = new Node(24);
		root.right.right.left = new Node(23);

	}

	public void createTree4() {
		int[] nums = { 10, 8, 15, 2, 9, 18, 14, 20, 11, 17 };
		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}
	}

	public void insert(int new_data) {
		if (root == null) {
			root = new Node(new_data);
		} else {
			Node current_node = root;

			while (true) {
				if (new_data < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(new_data);
						break;
					}
					current_node = current_node.left;
				}

				else if (new_data > current_node.data) {
					if (current_node.right == null) {
						current_node.right = new Node(new_data);
						break;
					}
					current_node = current_node.right;

				}
			}
		}
	}

	public void createTree5() {
		root = null;
		int[] nums = { 50, 30, 70, 10, 40, 60, 20, 45, 55, 65, 25 };
		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}
	}

	public void createTree6() {
		root = null;
		int[] nums = { 40, 20, 70, 30, 55, 85, 25, 35, 80, 32 };
		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}

	}

	public void searchDeleteNode(int data) {
		Queue<Node> queue = new ArrayDeque<Node>();

		queue.add(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();

			Node current_node = queue.poll();
			parent = current_node;
			if (parent.data == data) {
				deleteNode = parent;
				break;
			}

			for (int i = 0; i < levelSize; i++) {
				if (current_node.left != null) {
					if (current_node.left.data == data) {
						deleteNode = current_node.left;
						queue.clear();
						break;

					}

					queue.add(current_node.left);
				}

				if (current_node.right != null) {
					if (current_node.right.data == data) {
						deleteNode = current_node.right;
						queue.clear();
						break;
					}
					queue.add(current_node.right);
				}
			}
		}
	}

	public void delete(int target) {
    	   searchDeleteNode(target);
    	   if (root == null) {
    		   System.out.println("Empty Tree");
    	   } else if (deleteNode == null) {
    		   System.out.println("Cannot found the search node");
    	   } else {	
    		   if (deleteNode.left == null && deleteNode.right == null) {
    			   if (parent.left != null && parent.left.data == target) {
    				   parent.left = null;
    				   
                   }
    			   
    			   if (parent.right != null && parent.right.data == target) {
    				   parent.right = null;
    		   
    			   
                     }
                }
    		   
    		   else if (deleteNode.left != null && deleteNode.right != null) {
    			   Node successorParent = deleteNode;
    			   Node successor = deleteNode.right;
    			   
    			   while (successor.left != null) {
    				   successorParent = successor;
    				   successor = successor.left;
    			   }
    			   
    			   deleteNode.data = successor.data;
    			   
    			   if (successorParent.left == successor) {
    				   successorParent.left = successor.right;
    			   } else {
    				   successorParent.right = successor.right;
    				   
    				   
    			   } 
    				   
    			   
            }
    		   else {
    			   if (deleteNode.left != null) {
    				   if (parent.left.data == deleteNode.data) {
    					   parent.left = deleteNode.left ;
    					   
    				   		} else {
    				   			parent.right = deleteNode.left;
    				   		}
    			  } else {
    				   if (parent.left.data == deleteNode.data) {
    						 parent.left = deleteNode.right;
    				   } else {
    						 parent.right = deleteNode.right;
    			  }
    		   }
             }
          }
        }
	
	public void searchNode(int target) {
		searchNode = null;
		Node current = root;
		while (current != null) {
			if (current.data == target) {
				searchNode = current;
				break;
			}
			if (target < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
	}
}
