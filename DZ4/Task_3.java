import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_3 {

    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1, 2, 3, 3, 2, 1));

        boolean result = checkOn(deque);
        System.out.println(result);
    }

    public static boolean checkOn(Deque<Integer> deque) {
        while (deque.size() > 1) {
            int first = deque.pollFirst();
            int last = deque.pollLast();
            if (first != last) {
                return false;
            }
        }
        return true;
    }
}