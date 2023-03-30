import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            System.out.print("Введите число " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Введите множитель: ");
        int multiplier = scanner.nextInt();

        System.out.println("Результат умножения:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i] * multiplier);
        }
        scanner.close();
    }
}