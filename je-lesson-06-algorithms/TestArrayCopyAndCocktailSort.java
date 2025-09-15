import java.util.Arrays;
import java.util.Random;

public class TestArrayCopyAndCocktailSort {
    public static void main(String[] args) {
        System.out.println("Задача 1. Копирование массивов");
        System.out.println("    Проверка 1:");
        Integer[] source = {1, 2, 3, 4, 5};
        Integer[] target = {6, 7, 8, null, null};
        System.out.println("    source:" + Arrays.toString(source));
        System.out.println("    target:" + Arrays.toString(target));
        target = Array.arrayCopy(source, target);
        System.out.println("    result:" + Arrays.toString(target));
        System.out.println("    __________________________________");
        System.out.println("    Проверка 2:");
        Integer[] source2 = {1, 2, 3, 4, 5};
        Integer[] target2 = {};
        System.out.println("    source:" + Arrays.toString(source2));
        System.out.println("    target:" + Arrays.toString(target2));
        target2 = Array.arrayCopy(source2, target2);
        System.out.println("    result:" + Arrays.toString(target2));
        System.out.println("    __________________________________");
        System.out.println("    Проверка 3:");
        Integer[] source3 = {1, 2, 3, 4, 5};
        Integer[] target3 = {5, 6};
        System.out.println("    source:" + Arrays.toString(source3));
        System.out.println("    target:" + Arrays.toString(target3));
        target3 = Array.arrayCopy(source3, target3);
        System.out.println("    result:" + Arrays.toString(target3));
        System.out.println("______________________________________");

        System.out.println("Задача 2. Шейкерная сортировка");

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(15);
        }

        System.out.println("    1) Неотсортированный массив:" + Arrays.toString(array));

        array = Sorting.cocktailSort(array);
        System.out.println("       Отсортированный массив:" + Arrays.toString(array));

        int[] array2 = new int[]{5, 4, 3, 2, 1};
        System.out.println("    2) Неотсортированный массив:" + Arrays.toString(array2));

        array2 = Sorting.cocktailSort(array2);
        System.out.println("       Отсортированный массив:" + Arrays.toString(array2));
    }
}
