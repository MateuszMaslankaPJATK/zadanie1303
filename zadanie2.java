import java.util.HashMap;
import java.util.Map;

public class zadanie2 {

    public static int findDominant(int[] array) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int n = array.length;
        for (int num : array) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : array) {
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 3, 3, 2, 1};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {5, 5, 5, 1};

        System.out.println(findDominant(array1)); // 3
        System.out.println(findDominant(array2)); // -1
        System.out.println(findDominant(array3)); // 5
    }
}
