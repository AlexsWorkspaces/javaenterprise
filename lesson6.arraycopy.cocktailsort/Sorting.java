public class Sorting {
    public static int[] cocktailSort(int[] array) {
        int temp;
        int left = 0;
        int right = array.length - 1;
        boolean isSorted;

        while (left < right) {
            isSorted = true;

            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
            right--;

            isSorted = true;

            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
            left++;
        }
        return array;
    }
}
