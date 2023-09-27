package bigO;

import java.util.Arrays;
import java.util.List;

public class aLinear {
    private static List<String> list = Arrays.asList("Bob", "Robert", "Luke", "Vader", "Stark", "Peter");

    public static boolean findStark(List<String> list) {
        for (String s : list) {
            if (s.equals("Stark"))
                return true;
        }
        return false;
    }

    public static void logFirstItem(List<String> list) {
        System.out.println(list.get(0));
    }

    public static void logAllPairs(List<String> list) {
        for(String s1 : list) {
            for(String s2 : list) {
                System.out.println(s1 + " " + s2);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(findStark(list)); // O(n) -> Linear Time
        // The loop is repeated once for each element 'n' in the list

        logFirstItem(list); // O(1) -> Constant Time
        // Performs only one operation, regardless of the number
        // of elements in the list

        logAllPairs(list); // O(n * n) = O(n^2) -> Quadratic Time

    }
}
