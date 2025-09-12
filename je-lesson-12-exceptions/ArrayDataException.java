public class ArrayDataException extends Exception {
    int indexOfRow;
    int indexOfCol;

    public ArrayDataException(String message, int row, int col) {
        super(message);
        this.indexOfRow = row;
        this.indexOfCol = col;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "[" + indexOfRow + ":" + indexOfCol + "]";
    }
}
