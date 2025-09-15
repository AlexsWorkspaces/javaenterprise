import java.util.Arrays;

public class List {
    private Integer[] list;
    private int length;

    public List(int capacity) {
        this.list = new Integer[capacity];
        this.length = capacity;
    }

    public void add(int value) {
        // Если лист ещё не инициализирован или пуст
        if (list == null || length == 0) {
            list = new Integer[1];
            list[0] = value;
            length = 1;
            return;
        }

        // Заменяем последнее непустое значение
        for (int i = this.length - 1; i >= 0; i--) {
            if (list[i] != null) {
                if (i < this.length - 1) {
                    list[i + 1] = value;
                }
                return;
            }
        }
        // Все элементы пустые — вставляем в первый
        list[0] = value;
    }

    public int getValueByIndex(int index) {
        return this.list[index];
    }

    public int getSize() {
        return this.length;
    }

    public String toString() {
        return Arrays.toString(list);
    }

}