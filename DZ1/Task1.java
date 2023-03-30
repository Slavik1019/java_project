import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] cubes = new int[1000];
        for (int i = 1; i <= 1000; i++) {
            cubes[i - 1] = i * i * i;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();

        int cubeA = cubes[a - 1];
        int cubeB = cubes[b - 1];
        System.out.println("Куб из " + a + " равен " + cubeA);
        System.out.println("Куб из " + b + " равен " + cubeB);

        scanner.close();
    }
}