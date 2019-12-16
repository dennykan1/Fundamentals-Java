import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterMultiplierEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split("\\s+");
        String s1 = input[0];
        String s2 = input[1];

        System.out.println(getSum(s1, s2));
    }

    static int getSum(String s1, String s2) {
        int sum = 0;

        int minLength = Math.min(s1.length(), s2.length());
        for (int i = 0; i < minLength; i++) {
            char first = s1.charAt(i);
            char second = s2.charAt(i);
            sum += first * second;
        }

        String longerWord = (s1.length() > s2.length() ? s1 : s2);
        for (int i = minLength; i < longerWord.length(); i++) {
            sum += longerWord.charAt(i);
        }

        return sum;
    }
}
