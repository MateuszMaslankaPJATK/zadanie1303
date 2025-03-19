import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class zadanie1 {

    public static int[] filterEvenIndexOddValue(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }

        int[] filteredArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            filteredArray[i] = result.get(i);
        }
        return filteredArray;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {2, 3, 4, 5, 6, 7};
        int[] array3 = {7, 8, 9, 10, 11};

        System.out.println(Arrays.toString(filterEvenIndexOddValue(array1))); // [1, 5]
        System.out.println(Arrays.toString(filterEvenIndexOddValue(array2))); // []
        System.out.println(Arrays.toString(filterEvenIndexOddValue(array3))); // [7, 9, 11]
    }
}

