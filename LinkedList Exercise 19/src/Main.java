import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("black");
        colors.add("yellow");
        colors.add("green");

        System.out.println(colors);
        colors.pop();
        System.out.println("colors after pop = " + colors);
    }
}