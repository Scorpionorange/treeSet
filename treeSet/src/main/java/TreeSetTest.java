import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by ScorpionOrange on 2016/11/02.
 */
public class TreeSetTest {
    public static void main(String[] args){
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        SortedSet<Item> sortByDescription = new TreeSet<>((Item a, Item b) -> {
                String descrA = a.getDescription();
                String descrB = b.getDescription();
                return descrA.compareTo(descrB);
        });

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
