import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors1 = new ArrayList<>();
        colors1.add("red");
        colors1.add("blue");
        colors1.add("green");

        List<String> colors2 = new ArrayList<>();
        colors2.add("black");
        colors2.add("white");
        colors2.add("yellow");

        List<String> colors = new ArrayList<>();
        colors.addAll(colors1);
        colors.addAll(colors2);

        System.out.println(colors);
     }
}