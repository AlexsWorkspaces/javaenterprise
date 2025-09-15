public class ListQueueTest {
    public static void main(String[] args) {

        System.out.println("____________________________________________________________");
        System.out.println("Задача 1. Односвязный список");
        List list = new List(5);

        System.out.println("1. Инициализация списка " + list.toString());

        System.out.println("2. Реализация добавления в конец списка значения");
        list.add(6);
        System.out.println("    6: " + list.toString());
        list.add(7);
        System.out.println("    7: " + list.toString());
        list.add(3);
        System.out.println("    3: " + list.toString());
        list.add(9);
        System.out.println("    9: " + list.toString());

        System.out.println("3. Реализация получения значения по индексу: 3 элемент = \"" + list.getValueByIndex(3) + "\"");

        System.out.println("4. Реализация получения длины списка: " + list.getSize());

        System.out.println("____________________________________________________________");

        System.out.println("Задача 2. Очередь");

        Queue queue = new Queue(3);

        System.out.println("1. Реализация инициализации очереди " + queue.toString());

        System.out.println("2. Реализация добавления в хвост очереди значения");
        queue.addToTail(5);
        System.out.println("    5: " + queue.toString());
        queue.addToTail(8);
        System.out.println("    8: " + queue.toString());
        queue.addToTail(9);
        System.out.println("    9: " + queue.toString());
        queue.addToTail(13);
        System.out.println("    13: " + queue.toString());

        System.out.println("3. Реализация получения из головы очереди");
        int headFromQueue = queue.getFromTheHead();
        System.out.println("    " + headFromQueue + ": " + queue.toString());
        headFromQueue = queue.getFromTheHead();
        System.out.println("    " + headFromQueue + ": " + queue.toString());
        headFromQueue = queue.getFromTheHead();
        System.out.println("    " + headFromQueue + ": " + queue.toString());
        headFromQueue = queue.getFromTheHead();
        System.out.println("    " + headFromQueue + ": " + queue.toString());


        System.out.println("____________________________________________________________");

        System.out.println("Задача 3. Двойная очередь");

        TwoLinkedQueue twoLinkedQueue = new TwoLinkedQueue(3);

        System.out.println("1. Инициализация очереди " + twoLinkedQueue.toString());

        System.out.println("2. Реализация добавления в голову двойной очереди значения");
        twoLinkedQueue.addToHead(5);
        System.out.println("    5: " + twoLinkedQueue.toString());
        twoLinkedQueue.addToHead(9);
        System.out.println("    9: " + twoLinkedQueue.toString());
        twoLinkedQueue.addToHead(6);
        System.out.println("    6: " + twoLinkedQueue.toString());
        twoLinkedQueue.addToHead(4);
        System.out.println("    4: " + twoLinkedQueue.toString());

        System.out.println("3. Реализация получения из головы двойной очереди");
        int headFromTwoLinkedQueue = twoLinkedQueue.getFromTheHead();
        System.out.println("    " + headFromTwoLinkedQueue + ": " + twoLinkedQueue.toString());
        headFromTwoLinkedQueue = twoLinkedQueue.getFromTheHead();
        System.out.println("    " + headFromTwoLinkedQueue + ": " + twoLinkedQueue.toString());
        headFromTwoLinkedQueue = twoLinkedQueue.getFromTheHead();
        System.out.println("    " + headFromTwoLinkedQueue + ": " + twoLinkedQueue.toString());
        headFromTwoLinkedQueue = twoLinkedQueue.getFromTheHead();
        System.out.println("    " + headFromTwoLinkedQueue + ": " + twoLinkedQueue.toString());

        System.out.println("4. Реализация добавления в хвост двойной очереди значения");
        twoLinkedQueue.addToTail(5);
        System.out.println("    5: " + twoLinkedQueue.toString());
        twoLinkedQueue.addToTail(6);
        System.out.println("    6: " + twoLinkedQueue.toString());
        twoLinkedQueue.addToTail(8);
        System.out.println("    8: " + twoLinkedQueue.toString());

        System.out.println("5. Реализация получения из хвоста двойной очереди");
        int tailFromTwoLinkedQueue = twoLinkedQueue.getFromTheTail();
        System.out.println("    " + tailFromTwoLinkedQueue + ": " + twoLinkedQueue.toString());
        tailFromTwoLinkedQueue = twoLinkedQueue.getFromTheTail();
        System.out.println("    " + tailFromTwoLinkedQueue + ": " + twoLinkedQueue.toString());
        tailFromTwoLinkedQueue = twoLinkedQueue.getFromTheTail();
        System.out.println("    " + tailFromTwoLinkedQueue + ": " + twoLinkedQueue.toString());

        System.out.println("____________________________________________________________");
    }
}
