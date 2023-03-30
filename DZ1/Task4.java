public class Task4 {
    public static void main(String[] args) {
        int count = 0;
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    int q1 = q == '?' ? 0 : q - '0';
                    int w1 = w == '?' ? 0 : w - '0';
                    int e1 = e == '?' ? 0 : e - '0';

                    if (q1 + w1 == e1 && q1 >= 0 && w1 >= 0 && e1 >= 0) {
                        System.out.printf("%d%d + %d%d = %d%d%n", q1, w1, w1, q1, e1, e1);
                        count++;
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Решений не найдено.");
        } else {
            System.out.printf("Всего найдено %d решений.%n", count);
        }
    }
}