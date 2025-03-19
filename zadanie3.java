import java.util.Arrays;

public class zadanie3 {

    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        int[] rotated = new int[n];
        positions = positions % n;

        for (int i = 0; i < n; i++) {
            rotated[(i + positions) % n] = array[i];
        }

        return rotated;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3};

        System.out.println(Arrays.toString(rotateArray(array1, 2))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(rotateArray(array2, 3))); // [1, 2, 3]
    }
}
