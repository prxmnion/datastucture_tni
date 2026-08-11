import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class SinglyApp {

	public static SinglyLinkedList list1 = new SinglyLinkedList();
	public static SinglyLinkedList list2 = new SinglyLinkedList();
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Test method 'append()'\n----------------------");
		testAppend();
		
		System.out.println("\nTest method 'get()'\n-------------------");
		testGet();            
		
		System.out.println("\nTest method 'set()'\n-------------------");
		testSet();            
		
		System.out.println("\nTest method 'contains()'\n-----------------------");
		testContains();       
		
		System.out.println("\nTest method 'addAll()'\n---------------------");
		testAddAll();         

	} 

	public static void testAppend() {
		for (int i =101; i<106; i++) {
			list1.append(i);
		}
		System.out.println("Currrnt List => " + list1.displayList());
	}

	public static void testGet() {
		int i = 2;
		int j = 7;
		
		Object result1 = list1.get(i);
		if (result1 != null) {
			System.out.println("Get element index " + i + " = " + result1);
		} else {
			System.out.println("Get element index " + i + " = No data");
		}
		Object result2 = list1.get(j);
		if (result2 != null) {
			System.out.println("Get element index " + i + "=" + result2);
		} else {
			System.out.println("Get element index " + i + " = No data");
	   }
	 }

	public static void testSet() {
		list1.set(2, 111);
		System.out.println("Current list => " + list1.displayList());
		
		list2.set(7, 222);
		System.out.println("Current list => " + list1.displayList());
	}

	public static void testContains() {
		int find1 = 104;
		int find2 = 222;
		if (list1.contains(find1)) {
			System.out.println(find1 + " found!!");
		} else {
			System.out.println(find1 + " not found...");
		}
		if (list1.contains(find2)) {
			System.out.println(find2 + " found!!");
		} else {
			System.out.println(find2 + " not fount...");
		}
	}

	public static void testAddAll() {
		//teatcase 1
		System.out.println("Element in list1 => " + list1.displayList());
		System.out.println("Element in list2 => " + list2.displayList());
		list1.addAll(list2);
		System.out.println("Merge result => " + list1.displayList());
		
		//teatcase 2
		System.out.println();
		for (int i=201; i<206; i++) {
			list2.append(i);
		}
		System.out.println("Element in list1 => " + list1.displayList());
		System.out.println("Element in list2 => " + list2.displayList());
		list1.addAll(list2);
		System.out.println("Merge result => " + list1.displayList());
		
		//tastcase 3
		System.out.println();
		list1.clear();
		System.out.println("Element in list1 => " + list1.displayList());
		System.out.println("Element in list2 => " + list2.displayList());
		list1.addAll(list2);
		System.out.println("Merge result => " + list1.displayList());
		
	}

}