import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("hat");
        items.add("ball");
        items.add("bike");
        items.add("skateboard");

        System.out.println(items);

        String third = items.get(3);

        System.out.println(third);
    }
}