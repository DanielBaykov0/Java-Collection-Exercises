import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        System.out.println(colors);
        colors.add(1, "pink");
        System.out.println(colors);
    }
}