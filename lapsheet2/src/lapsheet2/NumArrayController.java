package lapsheet2;

public class NumArrayController {
	
	private int[] nums;
	
	public NumArrayController() {
		this.nums = new int[] {23,7,8,91,45,12,78};
		
	}

	public void setNumbers(int[] nums) {
		this.nums = nums;
		
	}
	
	public int getSize() {
	   return nums.length;
	}
	public int[] getNumArray() {
		return nums;

	}
    
	public void display(String message) {
		 System.out.print(message);
		for(int i=0; i<nums.length; i++) {
		    if (i !=0) {
		    	System.out.print(" ,");
		    }
		 System.out.print( nums[i]);
		}
	}
}
