import java.util.Arrays;

public class Queue {
    private Integer[] queue;
    private int length;

    public Queue(int capacity) {
        this.queue = new Integer[capacity];
        this.length = capacity;
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

    public int getFromTheHead() {
        if (queue.length != 0 && this.queue[0] != null) {
            int head = queue[0];
            Integer[] newQueue = Arrays.copyOfRange(queue, 1, this.length);
            this.queue = newQueue;
            this.length = newQueue.length;
            return head;
        }
        throw new RuntimeException("Очередь пустая");
    }

    public String toString() {
        return Arrays.toString(queue);
    }

}
