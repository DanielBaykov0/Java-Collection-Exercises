import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> colors1 = new ArrayList<>();
        colors1.add("red");
        colors1.add("black");
        colors1.add("green");
        colors1.add("orange");

        System.out.println("colors1 = " + colors1);
        ArrayList<String> colors = (ArrayList<String>) colors1.clone();
        System.out.println("colors = " + colors);

    }
}