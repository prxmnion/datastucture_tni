
public class BSTApp1 {

	public static void main(String[] args) {
		
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.sampleTree1();
		tree.printTree(tree.getRoot(), 0);

		
		// no.3
		System.out.println("Minimun Node is " +tree.findMinimum(tree.getRoot()).data);
        System.out.println("Maximun Node is " +tree.findMaximum(tree.getRoot()).data);
	    //Display the data  of Maximum Node
	
	    
        // no.5
        int target = 40;
	    System.out.println("Is 40 in BST => " +tree.findSpecificData(40));
	    //tree.findSpecificData(target)
	
	    
	    
	    // no.7
	    int delNode = 60;
	    tree.searchDeleteNode(delNode);
	    System.out.println("Parent is " +tree.getParent().data);
	    System.out.println("Delete Node is  " +tree.getDeleteNode().data);
	    
	    
	    
	    // no.9
	   tree.delete(delNode);
	   tree.printTree(tree.getRoot(), 0);
	   
	   
	    
	   
	}

}
