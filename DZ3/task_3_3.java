import java.util.ArrayList;

public class task_3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(3);
        list.add(8);

        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = (double) sum / list.size();

        System.out.println("Мин: " + min);
        System.out.println("Макс: " + max);
        System.out.println("Среднее: " + average);
    }
}