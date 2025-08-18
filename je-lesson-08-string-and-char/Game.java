import java.util.Random;
import java.util.Scanner;

public class Game {
    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
            "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
            "pepper", "pineapple", "pumpkin", "potato"};

    public static void playGame() {
        Random random = new Random();
        String secretWord = words[random.nextInt(words.length)];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Это игра по угадыванию слова. Для выхода из игры введите 'exit'");

        while (true) {
            System.out.println("Введите слово: ");
            String inputWord = scanner.nextLine();
            if (inputWord.equalsIgnoreCase("exit")) {
                System.out.println("Игра завершена.");
                break;
            }
            System.out.println("Вы ввели: " + inputWord);

            int i = 0;
            StringBuilder outputAnswer = new StringBuilder("###############");

            while (i < secretWord.length() && i < inputWord.length()) {
                if (secretWord.charAt(i) == inputWord.charAt(i)) {
                    outputAnswer.setCharAt(i, secretWord.charAt(i));
                }
                i++;
            }

            if (inputWord.equals(secretWord)) {
                System.out.println("Верно!");
                break;
            }
            System.out.println("Совпали следующие буквы:" + outputAnswer + "\n" + "Попробуйте снова!");
        }
        scanner.close();
    }
}
