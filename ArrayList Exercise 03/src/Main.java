import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<String> items = new ArrayList<>();
        items.add("hat");
        items.add("spoon");
        items.add("plate");
        items.add("bat");
        items.add(0, "toothbrush");

        for (String item : items) {
            System.out.println(item);
        }

    }
}