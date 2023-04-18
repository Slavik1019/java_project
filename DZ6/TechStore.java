import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TechStore {
    private List<Notebook> notebooks = new ArrayList<>();

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public List<Notebook> getNotebooks() {
        return notebooks;
    }

    public List<Notebook> filterNotebooks(Map<String, Object> filters) {
        List<Notebook> filteredNotebooks = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            boolean passesFilter = true;
            for (String filterKey : filters.keySet()) {
                Object filterValue = filters.get(filterKey);
                if (filterKey.equals("ramSize")) {
                    if (notebook.getRamSize() < (int) filterValue) {
                        passesFilter = false;
                        break;
                    }
                } else if (filterKey.equals("storageSize")) {
                    if (notebook.getStorageSize() < (int) filterValue) {
                        passesFilter = false;
                        break;
                    }
                } else if (filterKey.equals("operatingSystem")) {
                    if (!notebook.getOperatingSystem().equals(filterValue)) {
                        passesFilter = false;
                        break;
                    }
                } else if (filterKey.equals("color")) {
                    if (!notebook.getColor().equals(filterValue)) {
                        passesFilter = false;
                        break;
                    }
                }
            }
            if (passesFilter) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

    public static void main(String[] args) {
        TechStore store = new TechStore();
        store.addNotebook(new Notebook("Dell", "Inspiron", 8, 512, "Windows 10", "silver", 15000));
        store.addNotebook(new Notebook("HP", "Pavilion", 16, 1024, "Windows 11", "black", 30000));
        store.addNotebook(new Notebook("Apple", "MacBook Air", 8, 256, "macOS", "gold", 50000));
     // Фильтрация ноутбуков
     Scanner scanner = new Scanner(System.in);
     Map<String, Object> filters = new HashMap<>();

     System.out.println("Фильтрация ноутбуков");
     System.out.println("Введите цифру, соответствующую необходимому критерию:");
     System.out.println("1 - ОЗУ");
     System.out.println("2 - Объём ЖД");
     System.out.println("3 - Операционная система");
     System.out.println("4 - Цвет");
     System.out.print("> ");

     int filterChoice = scanner.nextInt();
     scanner.nextLine();

     if (filterChoice == 1) {
         System.out.print("Введите минимальный объём ОЗУ (в ГБ): ");
         int ramSize = scanner.nextInt();
         filters.put("ramSize", ramSize);
     } else if (filterChoice == 2) {
         System.out.print("Введите минимальный объём жесткого диска (в ГБ): ");
         int storageSize = scanner.nextInt();
         filters.put("storageSize", storageSize);
     } else if (filterChoice == 3) {
         System.out.print("Введите операционную систему: ");
         String operatingSystem = scanner.nextLine();
         filters.put("operatingSystem", operatingSystem);
     } else if (filterChoice == 4) {
         System.out.print("Введите цвет: ");
         String color = scanner.nextLine();
         filters.put("color", color);
     }

     List<Notebook> filteredNotebooks = store.filterNotebooks(filters);

     // Вывод отфильтрованных ноутбуков
     if (filteredNotebooks.isEmpty()) {
         System.out.println("Ноутбуки не найдены");
     } else {
         System.out.println("Найденные ноутбуки:");
         for (Notebook notebook : filteredNotebooks) {
             System.out.println(notebook);
         }
     }
     scanner.close();
 }
}