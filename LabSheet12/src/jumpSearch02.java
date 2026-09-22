import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class jumpSearch02 {

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

        int index = jumpSearch(nums, target);

        if (index != -1) {
            System.out.println("The target (" + target + ") at index " + index);
        } else {
            System.out.println("Cannot found " + target + " in this linked list");
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

    public static int jumpSearch(LinkedList<Integer> nums, int target) {
        int jump_size = (int) Math.floor(Math.sqrt(nums.size()));
        int start = 0;
        int m = 0;

        while (m < nums.size()) {
            if (target == nums.get(m)) {
                return m;
            }
            if (target > nums.get(m)) {
                start = m;
                m = m + jump_size;
            } else {
                for (int i = start; i < m; i++) {
                    if (target == nums.get(i)) {
                        return i;
                    }
                }
                return -1;
            }
        }

        if (m >= nums.size()) {
            for (int i = start; i < nums.size(); i++) {
                if (target == nums.get(i)) {
                    return i;
                }
            }
        }

        return -1;
    }
}