import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("black");

        System.out.println(colors);
        colors.addFirst("green");
        System.out.println(colors);
        colors.addLast("yellow");
        System.out.println(colors);
    }
}