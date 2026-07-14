
public class node {
	public Object data;
	public node   next;
	
	public node(Object data) {
		this.data = data;
		this.next = null;
		
	}

	
	public String getAddress() {
		return "" + Integer.toHexString(System.identityHashCode(this));
		
		
	}
     
	public static String getAddress(node node) {
		return (node == null) ? null : node.getAddress();
	}
}
