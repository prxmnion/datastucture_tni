import java.util.LinkedList;

public class TrainLinkedList {
    public static void main(String[] args) {

        LinkedList<String> greenline = new LinkedList<>();

        greenline.add("Mo-chit");

        greenline.add("Ari");

        greenline.add("Sanam-Pao");

        System.out.println("All Stations : " + greenline);

        greenline.add(2, "Rachakru");

        System.out.println("All Stations : " + greenline);

        System.out.println("Total Station: " + greenline.size());

        System.out.println("First Station: " + greenline.getFirst());

        greenline.set(0, "Mo-Chit (Central Ladprao)");

        System.out.println("All Stations : " + greenline);

        greenline.remove("Rachakru");

        System.out.println("All Stations : " + greenline);

        greenline.removeLast();

        System.out.println("All Stations : " + greenline);

        greenline.clear();

        System.out.println("Total Station: " + greenline.size());

        System.out.println("All Stations : " + greenline);
    }
}
