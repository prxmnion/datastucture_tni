import java.util.ArrayDeque;
import java.util.Deque;

public class Sorting {

	private int[] array;
	
	public Sorting(int[] array) {
        this.array = array;
    }
	public void printSortedData() {
		for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
		}
	}
     public void bubbleSort() {
    	 for (int i = 0; i < array.length; i ++) {    //  Loop through all element
    		 boolean is_swapped = false;
    		 for (int j = 0; j < array.length-i-1; j++) {
    			 int current_index = j;
    			 if (array[current_index] > array[current_index+1]) {
    				 // swap the element of array[j] and array[j+1]
    				 int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                     is_swapped = true;
    			 }
    		 }
    		 if (is_swapped == false) {
    			 break;
    		 }
    	 }
    	
     }
     public void bubbleSort(boolean order) {
    	 for (int i = 0; i < array.length; i ++) {  
    		 boolean is_swapped = false;
    		 for (int j = 0; j < array.length-i-1; j++) {
    			 if (order == true) {
    			 int current_index = j;
    			 if (array[current_index] < array[current_index+1]) {
    				 int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                     is_swapped = true;
    			 }
    		 }
    	}		 
    		 if (is_swapped == false) {
    			 break;
    		 }
    	 }
    	
     }
	
	 public void selectionSort() {
		 for (int i = 0; i < array.length; i ++) {
	            int   minimun_index  = i;
	            for (int j = i;j < array.length; j++) {
	                if (array[j] < array[minimun_index]) {
	                minimun_index = j;
	             }
	          }
	            int temp = array[i];
	            array[i] = array[minimun_index];
	            array[minimun_index] = temp; 
		 }
	 }
	 public void insertionSort() {
		 for (int i = 1; i < array.length; i ++) {  
			  int key = array[i];
			  int walker_index = i-1;
			  while (walker_index >= 0 && array[walker_index] > key) {
				  array[walker_index+1] = array[walker_index];  // walker_index - - ;
				  walker_index = walker_index-1;
			  
			 }
			  array[walker_index+1] = key;
		 }
	 }
	 
	 public void quickSort() {
		 Deque<Integer> stack = new ArrayDeque<Integer>();
		 stack.push(array.length-1);
		 stack.push(0);
		 while (!stack.isEmpty()) {
			 int low = stack.pop();
			 int hight = stack.pop();
			 if (hight - low < 1) {
				continue;
			 }
			 int j = partition(low,hight);
			 stack.push(hight);
			 stack.push(j+1);
			 stack.push(j);
			 stack.push(low);
	        } 
	 }
	 
	 private int partition(int low, int hight ) {
		 int pivot = array[low];
		 int i = low;
		 int j = hight;
		 while (true) {
			 while (array[i] < pivot) {
				 i++;
			}
			 while (array[j] > pivot) {
				 j--;
			}
			 if(i >= j) {
				 break;
			}
			// swap the element array[i] and array[j]
			 int temp = array[i];
			 array[i] = array[j];
			 array[j] = temp;
			 
			 i++;
			 j--;
		 }
		 return j;
	 }
}
