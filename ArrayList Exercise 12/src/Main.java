import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("white");
        colors.add("green");

        System.out.println(colors);

        List<String> portionList = colors.subList(1, 2);
        System.out.println(portionList);
    }
}