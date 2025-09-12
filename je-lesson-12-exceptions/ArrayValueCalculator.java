public class ArrayValueCalculator {
    private static final int sizeMatrix = 4;

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        checkSize(array);
        int[][] matrix = parseInt(array);
        return sumArray(matrix);
    }

    public static void checkSize(String[][] array) throws ArraySizeException {
        if (array.length != sizeMatrix) {
            throw new ArraySizeException("Invalid array size");
        }
        for (int i = 0; i < sizeMatrix; i++) {
            if (array[i].length != sizeMatrix) {
                throw new ArraySizeException("Invalid array size");
            }
        }
    }

    public static int sumArray(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int number : row) {
                sum += number;
            }
        }
        return sum;
    }

    public static int[][] parseInt(String[][] array) throws ArrayDataException {
        int[][] matrix = new int[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    matrix[i][j] = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Non-numeric value in cell: ", i + 1, j + 1);
                }
            }
        }
        return matrix;
    }
}
