public class LinkedList {

	private node head;

	public LinkedList() {
		this.head = null;

	}

	public String traversal() {
		node current_node = head;
		String result = "[";
		boolean first_node = true;
		while (current_node.next != null) {
			if (first_node == false) {
				result += ", ";
			}
			result += current_node.data;
			current_node = current_node.next;
		    first_node = false;

		}

		result += "]";
		return result;
	}

	public void insert(int position, Object value) {
		node new_node = new node(value);

		if (head == null) {
			head = new_node;
		}else if (position == 0) {
			new_node.next = head;
			head = new_node;
		}else {
			node current_node = head;
			int current_position = 0;
			while (current_node != null && current_position < position-1) {
				current_node = current_node.next;
				current_position++;
			}
		new_node.next = current_node.next;
		current_node.next = new_node;

		}


	}
	public void inset(Object value) {
		node new_node = new node(value);
		if(head == null) {
			head = new_node;
		}else {
			node current_node = head;
			while (current_node.next != null) {
				current_node = current_node.next;
			}

		current_node.next = new_node;
		}

	}

	public void remove(int position) {
		if (position == 0) {
			node current_node = head;
			head = current_node.next;
		}else {
			node current_node = head;
			int current_position = 0;
			while (current_node.next.next != null && current_position < position-1) {
				current_node = current_node.next;
				current_position++;
			}
		if(current_node.next != null) {
			current_node.next = current_node.next.next;
		}
	 }

	}
	public void removeLastElement() {
	  if(head != null) {
		  if(head.next == null) {
			  head = null;
		  }else {
			  node current_node = head;
			  while (current_node.next.next != null) {

			  }
		  current_node.next = null;
		  }
	  }

		}
     public int length() {
    	node current_node = head;
    	int count = 0;
    	while (current_node != null) {
    		count++;
    	    current_node = current_node.next;
    	}
    	    return count;

     }
     public Object get(int position) {
    	node current_node = head;
    	int current_position = 0;
    	while (current_node != null && current_position < position) {
    		current_node = current_node.next;
    		current_position++;
    	}
    	 return current_node.data;

     }

     public void set(int position, Object value) {
    	 node current_node = head;
     	int current_position = 0;
     	while (current_node != null && current_position < position) {
     		current_node = current_node.next;
     		current_position++;
     }
     current_node.data = value;
     }

     public void clear() {

     }












}

