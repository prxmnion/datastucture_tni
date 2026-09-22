import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class binarySearch02 {

    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();
        nums.sort((a, b) -> a.compareTo(b));

        System.out.print("Elements after sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter target: ");
        int target = scanner.nextInt();

        int index = binarySearch(nums, target);

        if (index != -1) {
            System.out.println("The target (" + target + ") at index " + index);
        } else {
            System.err.println("Cannot found " + target + " in this linked list");
        }
    }

    public static LinkedList<Integer> random_initial() {
        Random rnd = new Random();
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            nums.add(rnd.nextInt(100));
        }
        return nums;
    }

    public static int binarySearch(LinkedList<Integer> nums, int target) {
        int low = 0;
        int high = nums.size() - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            int midVal = nums.get(middle);

            if (midVal == target) {
                return middle;
            }
            if (target <= midVal) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return -1;
    }
}