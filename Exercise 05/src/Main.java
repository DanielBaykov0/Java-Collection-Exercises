import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("coat");
        items.add("belt");
        items.add("hat");
        items.add("ball");

        System.out.println(items);

        items.set(0, "jeans");

        System.out.println(items);
    }
}