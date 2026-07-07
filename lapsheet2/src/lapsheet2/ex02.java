package lapsheet2;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
	
		int[] nums=new int[5];
		 for(int i=0; i<nums.length; i++)		 {
		 System.out.print("Enter number index" + i + ": ");
		 nums[i] = scan.nextInt();
		 }
		 
		 NumArrayController displayNum = new NumArrayController();
		 displayNum.setNumbers(nums);
		 displayNum.display("display all element:");
		 
		 
 }
}
