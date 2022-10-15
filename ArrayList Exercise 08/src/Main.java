import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors);

        Collections.sort(colors);
        System.out.println("Array after sort " + colors);
    }
}