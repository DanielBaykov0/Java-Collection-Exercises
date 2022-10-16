import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("black");

        System.out.println(colors);

        colors.set(1, "yellow");
        System.out.println(colors);
    }
}