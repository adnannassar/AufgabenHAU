package Woche_001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // example_1();
        // example_2();
        example_map();


    }

    private static void example_map() {
        Map<String, Float>    stundenNoten = new HashMap<>();
        Map<String, Set<String>> zuordnung = new HashMap<>();
        zuordnung.put("Ahmad", new HashSet<>(Arrays.asList("Pk1", "Pk2")));
        stundenNoten.put("Amro", 1.0f);
        stundenNoten.put("Hiba", 2.3f);
        stundenNoten.put("Jian", 1.7f);

        System.out.println(stundenNoten);

        Collection<Float> values = stundenNoten.values();
        Set<String> keys = stundenNoten.keySet();

        System.out.println(values); // Collection
        System.out.println(keys); // Set
    }

    private static void example_1() {
        // Students list
        LinkedList<Student> list = new LinkedList<>(Arrays.asList(
                new Student("Ahmad", 25),
                new Student("Amro", 19),
                new Student("Hiba", 18),
                new Student("Jian", 26),
                new Student("Ahmad", 25)
        ));
        Collections.sort(list);
        System.out.println(list);


        Set<Student> set = new TreeSet<>(Arrays.asList(
                new Student("Ahmad", 25),
                new Student("Amro", 19),
                new Student("Hiba", 18),
                new Student("Jian", 25),
                new Student("Ahmad", 25)
        ));
        System.out.println(set);


        Student s1 = new Student("Ahmad", 25);
        Student s2 = new Student("Ahmad", 25);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));

    }

    private static void example_2() {
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList(
                "Apple", "Banana", "Cherry", "Date"
        ));

        LinkedList<String> list2 = new LinkedList<>(
                Arrays.asList("Banana", "Date", "Fig", "Grape"));

        System.out.println("List 1 before retainAll : " + list1);
        System.out.println("List 2 " + list2);

        boolean isUpdated = list1.retainAll(list2);

        System.out.println("List 1 after retainAll : " + list1);
        System.out.println("List 2 updated : " + isUpdated);
    }

}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Student s = (Student) o;
        if (this.age == s.age && Objects.equals(this.name, s.name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}