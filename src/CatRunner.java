import java.util.ArrayList;

public class CatRunner {
    public static void main (String [] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();

        Cat whiskers = new Cat("whiskers");
        Cat gato = new Cat("gato");
        Cat perro = new Cat("perro");

        cats.add(whiskers);
        cats.add(gato);
        cats.add(perro);

        System.out.println (cats);

        Cat cat4 = new Cat("amigo");
        Cat replcaedCat = cats.set(2,cat4);

        System.out.println(cats);
        System.out.println(cats.get(2));
    }
}
