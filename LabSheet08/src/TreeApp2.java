
public class TreeApp2 {

	public static void main(String[] args) {
	
		
		System.out.println("-------------------");
		System.out.println("Binary Tree From createTree4()");
		System.out.println("-------------------");
		 BinaryTree tree = new BinaryTree();
		tree.createTree4();
		tree.printTree(tree.getRoot(), 0);
		
		
		System.out.println("-------------------");
		System.out.println("Binary Tree From createTree5()");
		System.out.println("-------------------");
		tree.createTree5();
		tree.printTree(tree.getRoot(), 0);

		
		System.out.println("-------------------");
		System.out.println("Binary Tree From createTree6()");
		System.out.println("-------------------");
		tree.createTree6();
		tree.printTree(tree.getRoot(), 0);

	}

}
