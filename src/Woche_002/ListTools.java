package Woche_002;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ListTools {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

    }

    public static <T> List<T> repeatNTimes(List<T> list, int n) {
        List<T> result = new ArrayList<>(list.size() * n);
        for (int i = 0; i < n; i++) {
            result.addAll(list);
        }
        return result;
    }

    public static <T extends Comparable<T>> boolean sorted(List<T> list) {
        Comparator<T> comparator = Comparator.nullsFirst(Comparator.naturalOrder());
        for (int i = 0; i < list.size() - 1; i++) {
            if (comparator.compare(list.get(i), list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
