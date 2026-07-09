import java.util.ArrayList;

public class lab202 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        for (int i = 0; i < initial_numbers.length; i++) {
             numbers.add(initial_numbers[i]);
        }

        numbers.add(100);
        numbers.add(1, 200);
        numbers.remove(8);
        numbers.set(0, 7);

        System.out.println("numbers = " + numbers);
    }
}

