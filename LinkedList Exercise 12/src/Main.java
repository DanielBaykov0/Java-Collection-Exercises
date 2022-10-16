import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("white");
        colors.add("black");

        System.out.println(colors);
        colors.remove(2);
        System.out.println(colors);

    }
}