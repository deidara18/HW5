import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова",
                "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};
        Map<String, Integer> countMap = new HashMap<>();


        for (String name : names) {
            String firstName = name.split(" ")[0];
            if (countMap.containsKey(firstName)) {
                int count = countMap.get(firstName);
                countMap.put(firstName, count + 1);
            } else {
                countMap.put(firstName, 1);
            }
        }


        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(countMap.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));


        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println("Имя " + entry.getKey() + " - " + entry.getValue() + " раз(а)");
        }
    }
}