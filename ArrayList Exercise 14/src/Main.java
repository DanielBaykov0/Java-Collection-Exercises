import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("brown");
        colors.add("green");
        colors.add("blue");

        System.out.println(colors);

        Collections.swap(colors, 0, 2);

        System.out.println(colors);
    }
}