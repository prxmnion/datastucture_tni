import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class linearSearch02 {

    public static void main(String[] args) {
        LinkedList<Integer> nums = random_initial();

        System.out.print("Elements:");
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(" " + nums.get(i));
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter target: ");
        int target = scanner.nextInt();

        int index = linearSearch(nums, target);

        if (index != -1) {
            System.out.println("The target (" + target + ") at index " + index);
        } else {
            System.err.println("Cannot found " + target + " in this linked list");
        }
    }

    public static LinkedList<Integer> random_initial() {
        Random rnd = new Random();
        LinkedList<Integer> nums = new LinkedList<>();
        while (nums.size() < 10){
            nums.add(rnd.nextInt(99));
        }
        return nums;
    }

    public static int linearSearch(LinkedList<Integer> nums, int target) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == target) {
                return i;
            }
        }
        return -1;
    }

}