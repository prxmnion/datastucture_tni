import java.util.Scanner;

public class jumpSearch01 {

    public static void main(String[] args) {
        int[] nums = {96, 87, 18, 6, 31, 11, 56, 36, 76};
        nums = sorting(nums);

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter target: ");
        int target = scanner.nextInt();

        int index = jumpSearch(nums, target);

        if (index != -1) {
            System.out.println("The target (" + target + ") at index " + index);
        } else {
            System.out.println("Cannot found " + target + " in the array");
        }
    }

    public static int[] sorting(int[] nums) {
        Sorting sort = new Sorting(nums);
        sort.quickSort();
        nums = sort.getArray();

        System.out.print("Elements after sorting: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        return nums;
    }

    public static int jumpSearch(int[] nums, int target) {
        int jump_size = (int) Math.floor(Math.sqrt(nums.length));
        int start = 0;
        int m = 0;

        while (m < nums.length) {
            if (target == nums[m]) {
                return m;
            }
            if (target > nums[m]) {
                start = m;
                m = m + jump_size;
            } else {
                for (int i = start; i < m; i++) {
                    if (target == nums[i]) {
                        return i;
                    }
                }
                return -1;
            }
        }

        if (m >= nums.length) {
            for (int i = start; i < nums.length; i++) {
                if (target == nums[i]) {
                    return i;
                }
            }
        }

        return -1;
    }
}