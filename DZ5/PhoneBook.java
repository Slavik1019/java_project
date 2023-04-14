import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, List<String>> phoneBook = new HashMap<>();

        // добавление сотрудников в телефонную книгу
        phoneBook.put("Иван Иванов", Arrays.asList("123-456-789", "987-654-321"));
        phoneBook.put("Светлана Петрова", Collections.singletonList("111-222-333"));
        phoneBook.put("Кристина Белова", Collections.singletonList("444-555-666"));
        phoneBook.put("Анна Мусина", Collections.singletonList("777-888-999"));
        phoneBook.put("Анна Крутова", Collections.singletonList("000-111-222"));
        phoneBook.put("Иван Юрин", Collections.singletonList("374-411-555"));
        phoneBook.put("Петр Лыков", Arrays.asList("743-456-999", "977-654-421"));
        phoneBook.put("Павел Чернов", Collections.singletonList("111-222-333"));
        phoneBook.put("Петр Чернышов", Collections.singletonList("994-555-666"));
        phoneBook.put("Мария Федорова", Collections.singletonList("777-688-999"));
        phoneBook.put("Марина Светлова", Collections.singletonList("000-111-222"));
        phoneBook.put("Мария Савина", Collections.singletonList("333-444-555"));
        phoneBook.put("Мария Рыкова", Arrays.asList("193-456-719", "987-658-321"));
        phoneBook.put("Марина Лугова", Collections.singletonList("161-222-333"));
        phoneBook.put("Анна Владимирова", Collections.singletonList("484-555-666"));
        phoneBook.put("Иван Мечников", Collections.singletonList("777-188-969"));
        phoneBook.put("Петр Петин", Collections.singletonList("090-131-222"));
        phoneBook.put("Иван Ежов", Collections.singletonList("933-494-575"));







        // подсчет количества телефонов у каждого человека с учетом только имени
        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            String firstName = name.split(" ")[0];
            nameCounts.put(firstName, nameCounts.getOrDefault(firstName, 0) + phoneBook.get(name).size());
        }

        // создание списка повторяющихся имен без фамилий
        List<String> duplicates = new ArrayList<>();
        for (String name : nameCounts.keySet()) {
            if (nameCounts.get(name) > 1) {
                duplicates.add(name);
            }
        }

        // сортировка списка повторяющихся имен по убыванию популярности
        duplicates.sort((name1, name2) -> nameCounts.get(name2) - nameCounts.get(name1));

        // вывод повторяющихся имен с количеством повторений
        for (String name : duplicates) {
            System.out.println(name + " - " + nameCounts.get(name));
        }

        // сортировка имен с использованием алгоритма пирамидальной сортировки
        List<String> allNames = new ArrayList<>(nameCounts.keySet());
        heapSort(allNames);
        System.out.println(allNames);
    }

    // алгоритм пирамидальной сортировки
    private static void heapSort(List<String> list) {
        int n = list.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(list, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            Collections.swap(list, 0, i);
            heapify(list, i, 0);
        }
    }

    private static void heapify(List<String> list, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && list.get(left).compareTo(list.get(largest)) > 0) {
            largest = left;
        }
        if (right < n && list.get(right).compareTo(list.get(largest)) > 0) {
            largest = right;
        }
        if (largest != i) {
            Collections.swap(list, i, largest);
            heapify(list, n, largest);
        }
    }
}