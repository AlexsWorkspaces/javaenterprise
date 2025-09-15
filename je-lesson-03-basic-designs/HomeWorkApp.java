public class HomeWorkApp {

    public static void main(String[] args) {
    }

    static void printThreeWords() {
        System.out.println("Orange\n" + "Banana\n" + "Apple");
    }

    static void checkSumSign() {
        int a = 4;
        int b = -4;
        if (a + b >= 0) {
            System.out.println("The sum is positive");
        } else {
            System.out.println("The sum is negative");
        }
    }

    static void printColor() {
        int value = 178;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 4;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean checkIfSumIsInRange(int number1, int number2) {
        int sum = number1 + number2;
        return ((sum >= 10) && (sum <= 20));
    }

    static void checkIfNumberIsPositive(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    static boolean checkIfNumberIsNegative(int number) {
        return number < 0;
    }

    static void printLineNTimes(String line, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }
    }

    static boolean isYearALeapYear(int year) {
        return ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)));
    }
}