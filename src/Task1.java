import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Task1 {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 1) Добавление номера
// 2) Вывод всего
// Пример:
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 1242353
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я ввожу: 1
// К: Введите фамилию
// Я: Иванов
// К: Введите номер
// Я: 547568
// К: Введите 1) Добавление номера
// 2) Вывод всего
// Я: 2
// Иванов: 1242353, 547568

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println(
                "Чтобы добавить в базу абонента нажмите: 1.\n" +
                "Чтобы узнать номер(а) клиента нажмите : 2.");

        while (true) {
            Scanner in = new Scanner(System.in);
            String func = in.nextLine();

            switch (func) {
                case ("1") -> {
                    System.out.print(("Введите Фамилию: "));
                    String Surname = in.nextLine();

                    System.out.print(("Введите номер: "));
                    Integer number = in.nextInt();
                    array.add(number);

                    map.put(Surname, array);
                    System.out.print(("Данные записаны. \n"));
                }
                case ("2") -> {
                    System.out.print(("Введите Фамилию: "));
                    String name = in.nextLine();
                    map.get(name);
                    System.out.println("У " + name + " есть следующие номера: " + map.get(name));
                }
                default -> {
                }
            }
        }
    }
}


