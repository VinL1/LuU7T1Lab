import java.util.ArrayList;
import java.util.Locale;

public class    CatRunner {
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
        Cat replacedCat = cats.set(2,cat4);

        System.out.println(cats);
        System.out.println(replacedCat);

        cat4.setName(cat4.getName() + "Meow");
        System.out.println(cat4);

        for (int i = 0; i < cats.size(); i ++){
            String newName = cats.get(i).getName().toUpperCase();
            cats.get(i).setName(newName);
        }
        System.out.println(cats);

        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
