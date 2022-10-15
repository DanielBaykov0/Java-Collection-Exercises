import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("brown");
        colors.add("green");

        colors.set(1, "white");

        System.out.println(colors.toString().replaceAll("[\\[\\],]", ""));
    }
}