import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExplosionEx7 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String inputText = read.readLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputText.length(); i++) {
            char symbol = inputText.charAt(i);

            if (symbol == '>') {
                result.append(">");
                i++;
                int power = inputText.charAt(i) - '0';
                power--;

                while (power > 0 && i < inputText.length() - 1) {
                    i++;
                    symbol = inputText.charAt(i);
                    if (symbol == '>') {
                        result.append(">");
                        i++;
                        power += inputText.charAt(i) - '0';
                        power--;
                        continue;
                    }
                    power--;
                }
            } else {
                result.append(symbol);
            }
        }
        System.out.println(result);


    }

}
