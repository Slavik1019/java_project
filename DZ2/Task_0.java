public class Task_0 {

    // Посчитайте сколько драгоценных камней в куче обычных камней
    // Пример:
    // jewels = “aB”, stones = “aaaAbbbB”
    // Результат в консоль ”a3B1”
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = findJewelsInStones(jewels, stones);
        System.out.println(result);
    }

    public static String findJewelsInStones(String jewels, String stones) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jewels.length(); i++) {
            char jewel = jewels.charAt(i);
            int count = 0;
            for (int j = 0; j < stones.length(); j++) {
                char stone = stones.charAt(j);
                if (jewel == stone) {
                    count++;
                }
            }
            sb.append(jewel).append(count);
        }
        return sb.toString();
    }
}