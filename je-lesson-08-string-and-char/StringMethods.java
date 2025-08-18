public class StringMethods {
    public static void main(String[] args) {

        System.out.println("1. findSymbolOccurance");
        String outputString = "    В пословице \"%s\" символ '%c' встречается %d раз(а)";

        String proverb = "Без труда не выловишь и рыбку из пруда";
        char symbol = 'а';

        int amountOfLetters = findSymbolOccurance(proverb, symbol);
        System.out.println(outputString.formatted(proverb, symbol, amountOfLetters));

        System.out.println("2. findWordPosition");
        String source = "каракатица";
        String target = "кат";
        int index = findWordPosition(source, target);
        if (index >= 0) {
            System.out.println("    В слове " + source + " слово " + target + " на " + index + " индексе");
        } else {
            System.out.println("    В слове " + source + " нет слова " + target);
        }

        System.out.println("3. stringReverse");
        String word = "квалификация";
        System.out.println("    Слово " + word + " наоборот: " + stringReverse(word));

        System.out.println("4. isPalindrome");
        String string = "allo";
        System.out.println("    Слово " + string + " паллиндром?: " + isPalindrome(string));

        System.out.println("______________________________________________");
        System.out.println("5. Программа по отгадыванию слов");
        Game.playGame();
    }

    public static int findSymbolOccurance(String string, char symbol) {
        if (string != null) {
            String lowerCaseString = string.toLowerCase();
            return lowerCaseString.length() - lowerCaseString.replace(String.valueOf(symbol), "").length();
        }
        return 0;
    }


    public static int findWordPosition(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }

        int i = 0;
        int j = 0;
        int pos = 0;
        while (i < source.length() && j < target.length()) {
            if (source.charAt(i) == target.charAt(j)) {
                j++;
                pos = i;
            } else if (j > 0) {
                j = 0;
                pos = 0;
            }
            i++;
        }
        if (j == target.length()) {
            return pos - target.length() + 1;
        }
        return -1;
    }

    public static String stringReverse(String string) {
        int i = 0;
        int j = string.length() - 1;
        char[] reverseString = new char[string.length()];
        while (i < string.length()) {
            reverseString[i] = string.charAt(j);
            i++;
            j--;
        }
        return new String(reverseString);
    }

    public static boolean isPalindrome(String string) {
        if (string == null) {
            return false;
        }

        int i = 0;
        int j = string.length() - 1;
        while (i < string.length() / 2) {
            if (string.charAt(i) == string.charAt(j)) {
                i++;
                j--;
            } else return false;
        }
        return true;
    }
}
