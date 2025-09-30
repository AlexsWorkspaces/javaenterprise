import phonebook.PhoneBook;
import phonebook.Record;
import utill.CollectionsUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("banana");
        words.add("apple");
        words.add("mango");
        words.add("apple");
        words.add("apple");
        words.add("peach");
        words.add("peach");
        words.add("peach");

        String string = "banana";

        int numberOfStringsInTheList = CollectionsUtils.countOccurrence(words, string);

        System.out.println("Задание 1");
        System.out.println("    1. Строка " + string + " встречается в листе " + numberOfStringsInTheList + " раз(а)");

        int[] numbers = {1, 2, 3, 2, 3, 4, 5, 1, 6, 2, 3};

        List<Integer> integerList = CollectionsUtils.toList(numbers);
        System.out.println("    2. Конвертация массива в список: " + integerList);

        List<Integer> integerUniqueList = CollectionsUtils.findUnique(integerList);
        System.out.println("    3. Поиск уникальных значений: " + integerUniqueList);

        System.out.print("    4. Слова в списке встречаются столько раз: ");
        CollectionsUtils.calcOccurrence(words);

        System.out.println("    5. Слова в списке встречаются столько раз: " + CollectionsUtils.findOccurrence(words));

        System.out.println("______________________________________________________________________");

        System.out.println("Задание 2");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(new Record("Alexey", "349250"));
        phoneBook.add(new Record("Nikolay", "329223"));
        phoneBook.add(new Record("Aleksandr", "1030492"));
        phoneBook.add(new Record("Kirill", "1489205"));
        phoneBook.add(new Record("Slava", "4028523"));
        phoneBook.add(new Record("Alexey", "23014853"));
        phoneBook.add(new Record("Kirill", "6482428"));

        System.out.println("    Реализация метода find: " + phoneBook.find("Alexey"));
        System.out.println("    Реализация метода findAll: " + phoneBook.findAll("Kirill"));
    }
}
