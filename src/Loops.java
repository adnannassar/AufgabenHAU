import java.util.Arrays;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        List<Integer> zahlen = List.of(1, 2, 3);

        for (int i = 0; i < zahlen.size() - 1; i++) {
            System.out.print(zahlen.get(i) + " ");
        }
        System.out.println();

        for (int x : zahlen) {
            System.out.print(x + " ");
        }
        System.out.println();

        zahlen.forEach(x -> System.out.print(x + " "));

        int[][] array = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}};
        System.out.println("\n\n");
        for (int[] intArray : array) {
            for (int x : intArray) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
