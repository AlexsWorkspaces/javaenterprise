import java.util.Arrays;

public class TwoLinkedQueue {
    private Integer[] queue;
    private int length;

    public TwoLinkedQueue(int capacity) {
        this.queue = new Integer[capacity];
        this.length = capacity;
    }

    public void addToHead(int value) {
        // Обработка пустого или неинициализированного массива
        if (queue == null || length == 0) {
            queue = new Integer[1];
            queue[0] = value;
            length = 1;
            return;
        }

        // если есть место в массиве двигаем элементы
        if (queue[this.length - 1] == null) {
            if (queue[0] != null) {
                for (int i = this.length - 1; i >= 1; i--) {
                    queue[i] = queue[i - 1];
                }
            }
            queue[0] = value;
        }
        // если места в массиве нет - создаем новый и переносим элементы со сдвигом
        else {
            Integer[] newQueue = new Integer[this.length + 1];
            newQueue[0] = value;
            System.arraycopy(queue, 0, newQueue, 1, this.length);
            this.queue = newQueue;
            this.length = newQueue.length;
        }
    }

    public int getFromTheHead() {
        if (queue.length != 0 && this.queue[0] != null) {
            int head = queue[0];
            Integer[] newQueue = Arrays.copyOfRange(queue, 1, this.length);
            this.queue = newQueue;
            this.length = newQueue.length;
            return head;
        }
        throw new RuntimeException("очередь пустая");
    }

    public void addToTail(int value) {
        // Если очередь ещё не инициализирована или пуста
        if (queue == null || length == 0) {
            queue = new Integer[1];
            queue[0] = value;
            length = 1;
            return;
        }

        // Ищем последнее непустое значение
        for (int i = this.length - 1; i >= 0; i--) {
            if (queue[i] != null) {
                if (i < this.length - 1) {
                    queue[i + 1] = value;
                } else {
                    Integer[] newQueue = Arrays.copyOf(queue, this.length + 1);
                    newQueue[newQueue.length - 1] = value;
                    this.length = newQueue.length;
                    this.queue = newQueue;
                }
                return;
            }
        }
        // Все элементы пустые — вставляем в первый
        queue[0] = value;
    }

    public int getFromTheTail() {
        // Если очередь не пустая - выдача последнего элемента
        if (queue.length != 0 && this.queue[0] != null) {
            for (int i = this.length - 1; i >= 0; i++) {
                if (queue[i] != null) {
                    int tail = queue[i];
                    Integer[] newQueue = Arrays.copyOfRange(queue, 0, i);
                    this.queue = newQueue;
                    this.length = newQueue.length;
                    return tail;
                }
            }
        }
        throw new RuntimeException("Очередь пустая");
    }

    public String toString() {
        return Arrays.toString(this.queue);
    }


}

