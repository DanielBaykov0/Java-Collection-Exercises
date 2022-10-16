import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        System.out.println(colors.isEmpty() ? "Yes" : "No");
        colors.removeAll(colors);
        System.out.println(colors.isEmpty() ? "Yes" : "No");
    }
}