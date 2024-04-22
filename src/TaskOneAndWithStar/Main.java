package TaskOneAndWithStar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        User user1 = new User(1, "qwerty", "1234", new Status("VIP"));
        User user2 = new User(2, "qwerty", "1234", new Status("VIP"));
        User clone;
        System.out.println("В базе данных имеются следующие пользователи: \n" + user1 + "\n" + user2 + "\nВведите id пользователя, которого хотите клонировать:");
        if (scanner.hasNextInt()) {
            int id = scanner.nextInt();
            if (id == 1) {
                System.out.println("Какое клонирование Вы хотели бы выполнить? Введите 1 - для поверхностного, 2 - для глубокого.");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    clone = user1.cloneShallow();
                } else if (choice == 2) {
                    clone = user1.cloneDeep();
                } else {
                    System.out.println("Вы ввели не то число!");
                    return;
                }
            } else if (id == 2) {
                System.out.println("Какое клонирование Вы хотели бы выполнить? Введите 1 - для поверхностного, 2 - для глубокого.");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    clone = user2.cloneShallow();
                } else if (choice == 2) {
                    clone = user2.cloneDeep();
                } else {
                    System.out.println("Вы ввели не то число!");
                    return;
                }
            } else {
                System.out.println("Такого id не существует!");
                return;
            }
        } else {
            System.out.println("Вы ввели не число!");
            return;
        }
        System.out.println("Программа изменила статус у клона на common и id второго юзера на 1!");
        clone.getStatus().setStatus("common");
        user2.setId(1);
        System.out.println(user1 + "\n" + user2 + "\nКлон: " + clone);
        System.out.println("Результаты сравнения первого и второго юзера через ==: " + (user1 == user2));
        System.out.println("Результаты сравнения первого и второго юзера через equals: " + user1.equals(user2));
        System.out.println("Результаты сравнения первого юзера и клона через ==: " + (user1 == clone));
        System.out.println("Результаты сравнения первого юзера и клона через equals: " + user1.equals(clone));
        System.out.println("Результаты сравнения второго юзера и клона через ==: " + (user2 == clone));
        System.out.println("Результаты сравнения второго юзера и клона через equals: " + user2.equals(clone));

    }
}