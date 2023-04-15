import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AwkwardMap {
    private final static HashMap<String, Set<Klausur>> studentenKlausuren = new HashMap<>();
    public static void main(String[] args) {
        add("Ahmad", new Klausur("Pk1", 1.0f));
        add("Ahmad", new Klausur("Pk2", 1.0f));
        add("Amr", new Klausur("Pk1", 1.3f));
        add("Jian", new Klausur("Pk2", 1.7f));
        add("Hiba", new Klausur("Pk1", 1.0f));
        add("Hiba", new Klausur("Pk2", 1.0f));


        System.out.println(studentenKlausuren);
    }



    private static void add(String student, Klausur bestandenKlausur) {
        Set<Klausur> bestandenKlausuren = studentenKlausuren.get(student);
        if (bestandenKlausuren == null) {
            bestandenKlausuren = new HashSet<>();
        }
        bestandenKlausuren.add(bestandenKlausur);
        studentenKlausuren.put(student, bestandenKlausuren);
    }
}

class Klausur{
    String name;
    float mark;

    public Klausur(String name, float mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "("+ name+ ", " + mark+")";
    }
}
