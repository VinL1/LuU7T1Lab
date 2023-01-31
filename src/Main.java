import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
        ArrayList<String> trees = new ArrayList<String>();
        trees.add("pine");
        trees.add("maple");
        trees.add("fraiser fir");

        System.out.println(trees);
        System.out.println(trees.size());

        System.out.println(trees.get(1));
    }
}
