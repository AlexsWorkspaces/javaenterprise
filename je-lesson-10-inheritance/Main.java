public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурка");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Рэкс");

        // Тестируем действия
        cat1.run(150);
        cat2.run(250);
        dog1.run(400);
        dog2.run(600);
        dog1.swim(5);
        dog2.swim(15);

        System.out.println();
        // Выводим статистику
        System.out.println("Всего животных: " + Animal.amountOf());
        System.out.println("Котов: " + Cat.amountOf());
        System.out.println("Собак: " + Dog.amountOf());
    }
}
