package lapsheet2;

public class ex01 {

	public static void main(String[] args) {
		 
	 int[] nums= {23,7,8,91,45,12,78};
	 System.out.print("Length = " + nums.length);
	 System.out.print("Firsst element = " + nums[0]);
	 System.out.print("Last element = " + nums[nums.length-1]);
	 System.out.print("Middle element = " + nums[nums.length/2]);
	 
	 System.out.print("\nDisplay all element: ");
	 
	 for(int i=0; i<nums.length; i++){
	    if (i !=0) {
	    	System.out.print(" ,");
	    }
	 System.out.print( nums[i]);
	 }
	}
}


