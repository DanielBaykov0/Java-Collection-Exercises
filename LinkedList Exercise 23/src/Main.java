import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("black");
        colors.add("white");
        colors.add("green");

        List<String> list = new ArrayList<>(colors);

        for (String color : list) {
            System.out.println(color);
        }
    }
}