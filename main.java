public class main {
    public static void main(String[] args) {
        int[] result1 = filterEvenIndexOddValue(new int[]{1, 2, 3, 4, 5, 6});
        int[] result2 = filterEvenIndexOddValue(new int[]{2, 3, 4, 5, 6, 7});
        int[] result3 = filterEvenIndexOddValue(new int[]{7, 8, 9, 10, 11});

        System.out.println(java.util.Arrays.toString(result1));
        System.out.println(java.util.Arrays.toString(result2));
        System.out.println(java.util.Arrays.toString(result3));
    }
    //
    public static int[] filterEvenIndexOddValue(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                result[index++] = array[i];
            }
        }
        return result;
    }
}