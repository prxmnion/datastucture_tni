
public class TestApp {

	public static void main(String[] args) {
		
        int[] nums = {11, 9, 23, 87, 38, 22, 92, 10};
        Sorting sort = new Sorting(nums);
        sort.bubbleSort();
        sort.printSortedData();
        
        System.out.println();
        int[] nums1 = {11, 9, 23, 87, 38, 22, 92, 10}; // เพิ่มการประกาศ nums1
        Sorting sort1 = new Sorting(nums1);
        sort1.bubbleSort(true); // true = น้อยไปมาก / false = มากไปน้อย
        sort1.printSortedData();
        
        
        // no.2
        System.out.println();
        int[] nums2 = {25, 11, 45, 6, 87, 20, 78, 64};
        Sorting sort2 = new Sorting(nums2);
        sort2.selectionSort();
        sort2.printSortedData();
        
        
        // no.4
        System.out.println();
        int[] nums3 = {68, 10, 87, 75, 14, 36, 98, 76};
        Sorting sort3 = new Sorting(nums3);
        sort3.insertionSort(); // เปลี่ยนเป็น insertionSort()
        sort3.printSortedData();
        
        
        // no.6
        System.out.println();
        int[] nums4 = {87, 11, 26, 35, 49, 85, 21, 46};
        Sorting sort4 = new Sorting(nums4);
        sort4.quickSort(); // Quick Sort
        sort4.printSortedData();
	}

}
