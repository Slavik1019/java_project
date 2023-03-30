import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num1, num2, result;
        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите первое число:");
        num1 = input.nextInt();

        System.out.println("Введите оператор (+, -, *, /):");
        operator = input.next().charAt(0);

        System.out.println("Введите второе число:");
        num2 = input.nextInt();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            default:
                System.out.println("Ошибка: некорректный оператор!");
                break;
        }

        input.close();
    }
}