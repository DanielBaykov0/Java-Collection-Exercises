import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("brown");
        colors.add("yellow");
        colors.add("white");

        List<String> colors2 = new ArrayList<>();
        colors2.add("black");
        colors2.add("brown");
        colors2.add("blue");
        colors2.add("orange");

        List<String> colors3 = new ArrayList<>();
        for (String color : colors) {
            colors3.add(colors2.contains(color) ? "Yes" : "No");
        }

        System.out.println(colors3);
    }
}