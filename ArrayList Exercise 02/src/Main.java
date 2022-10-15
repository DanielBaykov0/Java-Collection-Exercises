import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> items = new ArrayList<>();
        items.add("ball");
        items.add("pen");
        items.add("hat");
        items.add("keyboard");

        for (String item : items) {
            System.out.println(item);
        }

    }
}