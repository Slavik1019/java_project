import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества строк в книге
        System.out.print("Введите количество строк в книге: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Ввод строк книги
        System.out.println("Введите строки книги:");
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }

        // Ввод количества продуктов с аллергией
        System.out.print("Введите количество продуктов, на которые у человека аллергия: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        // Ввод пар продуктов
        System.out.println("Введите пары продуктов вида 'продукт1 - продукт2':");
        String[] fromToPairs = new String[m];
        for (int i = 0; i < m; i++) {
            fromToPairs[i] = scanner.nextLine();
        }

        // Замена продуктов
        for (int i = 0; i < n; i++) {
            String line = lines[i];
            for (String fromToPair : fromToPairs) {
                String[] fromTo = fromToPair.split(" - ");
                String from = fromTo[0];
                String to = fromTo[1];
                line = line.replaceAll("\\b" + from + "\\b", to);
                line = line.replaceAll("\\b" + from.substring(0, 1).toUpperCase() + from.substring(1) + "\\b", to.substring(0, 1).toUpperCase() + to.substring(1));
            }
            System.out.println(line);
        }
        scanner.close();
    }
}