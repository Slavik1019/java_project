public class Task_1 {
    
    public static void main(String[] args) {
        String s = "cba";
        int[] index = {2, 1, 0};
        String result = shuffle(s, index);
        System.out.println(result); // "abc"
    }

    public static String shuffle(final String s, final int[] index) {
        char[] shuffledChars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffledChars[index[i]] = s.charAt(i);
        }
        return new String(shuffledChars);
    }
}