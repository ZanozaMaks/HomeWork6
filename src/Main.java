public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();



    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i = i + 1) {
            System.out.println(i);
            // Пишем код для задачи 1
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);
            // Пишем код для задачи 2
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
            // Пишем код для задачи 3

        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.println(i);
            // Пишем код для задачи 4

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
            // Пишем код для задачи 5

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i < 99; i = i + 7)
            System.out.println(i);
        // Пишем код для задачи 6
    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i < 513; i = i * 2)
            System.out.println(i);
        // Пишем код для задачи 7
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int jar = 0;
        for (int i = 1; i < 13; i++) {
            jar = jar + salary;
            System.out.println("Месяц " + i + " Сумма " + jar);
        }
        // Пишем код для задачи 8
    }

    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        int bankAtInterest = 0;
        for (int i = 1; i < 13; i++) {
            bankAtInterest = bankAtInterest + bankAtInterest / 100;
            bankAtInterest = bankAtInterest + salary;
            System.out.println("Месяц " + i + " Сумма " + bankAtInterest);

            // Пишем код для задачи 9
        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        for (int i = 2; i < 21; i = i + 1 * 2) {
            System.out.println("Таблица умножения: " + i);
        }
        // Пишем код для задачи 10

    }
}





