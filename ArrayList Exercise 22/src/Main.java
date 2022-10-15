import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("white");
        colors.add("orange");

        System.out.println(colors.toString().replaceAll("[\\[\\],]", ""));

        System.out.println("Print using index:");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}