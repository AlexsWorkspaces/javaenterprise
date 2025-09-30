package utill;

import java.util.*;

public class CollectionsUtils {
    public static int countOccurrence(List<String> words, String string) {
        int counter = 0;
        for (String word : words) {
            if (word.equals(string)) {
                counter++;
            }
        }
        return counter;
    }

    public static List<Integer> toList(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }

    //O(n log n), через .contains O(n^2)
    public static List<Integer> findUnique(List<Integer> integerList) {
        Collections.sort(integerList);
        List<Integer> integerUniqueList = new ArrayList<>();
        integerUniqueList.add(integerList.getFirst());

        for (int i = 1; i < integerList.size(); i++) {
            if (!integerList.get(i - 1).equals(integerList.get(i))) {
                integerUniqueList.add(integerList.get(i));
            }
        }
        return integerUniqueList;
    }


    //O(n log n)
    public static void calcOccurrence(List<String> words) {
        Collections.sort(words);
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        uniqueWords.add(words.getFirst());
        int count = 1;

        for (int i = 1; i < words.size(); i++) {
            if (!words.get(i - 1).equals(words.get(i))) {
                uniqueWords.add(words.get(i));
                counts.add(count);
                count = 1;
            } else {
                count++;
            }
        }
        counts.add(count);

        int i;
        for (i = 0; i < uniqueWords.size(); i++) {
            System.out.print(uniqueWords.get(i) + ": " + counts.get(i));
            if (i == uniqueWords.size() - 1) {
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
    }

    //O(n log n)
    public static List<WordOccurrence> findOccurrence(List<String> words) {
        Collections.sort(words);
        List<WordOccurrence> wordOccurrences = new ArrayList<>();
        wordOccurrences.add(new WordOccurrence(words.getFirst()));
        int count = 1;

        int i;
        for (i = 1; i < words.size(); i++) {
            if (!words.get(i - 1).equals(words.get(i))) {
                wordOccurrences.getLast().setOccurrence(count);
                wordOccurrences.add(new WordOccurrence(words.get(i)));
                count = 1;
            } else {
                count++;
            }
        }
        wordOccurrences.getLast().setOccurrence(count);
        return wordOccurrences;
    }
}


