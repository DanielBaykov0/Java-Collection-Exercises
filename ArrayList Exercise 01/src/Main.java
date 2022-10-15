import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");

        System.out.println(String.join(", ", colors));
    }
}