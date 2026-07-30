import java.util.Stack;

public class Stack01 {

    public static void main(String[] args) {

        int[] carriage = {1, 2, 3, 4, 5};

        Stack<Integer> stack = new Stack<>();

        for (int car : carriage) {
            System.out.println("Siding onto dead-end track: Car " + car);
            stack.push(car);
        }

        System.out.println("\nStack -> " + stack + "\n");

        while (!stack.isEmpty()) {
            int removedCar = stack.pop();
            System.out.println("Exiting a dead-end: Car " + removedCar);
        }

        System.out.println("\nStack -> " + stack);
    }
}
