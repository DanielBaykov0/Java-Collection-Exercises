import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("orange");
        colors.add("black");

        System.out.println(colors);
        colors.offerFirst("pink");
        System.out.println(colors);
    }
}