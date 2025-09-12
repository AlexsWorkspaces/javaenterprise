import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[][] matrix = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "f"},
        };

        try {
            System.out.println(ArrayValueCalculator.doCalc(matrix));
        } catch (ArraySizeException | ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
