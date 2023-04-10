import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;

public class Task_4 {

    //Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
    // и каждый из их узлов содержит одну цифру.
    // Сложите два числа и верните сумму в виде связанного списка.
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));
        // result [6,6,0,1]
        Deque<Integer> result = sum(d1, d2);
        System.out.println(result);
    }


    public static Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
        Deque<Integer> result = new ArrayDeque<>();
        int carry = 0;
        while (!d1.isEmpty() || !d2.isEmpty() || carry > 0) {
            int digit1 = d1.isEmpty() ? 0 : d1.removeFirst();
            int digit2 = d2.isEmpty() ? 0 : d2.removeFirst();
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;
            result.addLast(digit);
        }
        return result;
    }
}