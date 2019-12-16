import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ValidUsernamesEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String[] input = read.readLine().split(", ");

        for (int i = 0; i < input.length; i++) {
            int foundSymbol = 0;

            if (input[i].length() >= 3 && input[i].length() <= 16) {
                StringBuilder word = new StringBuilder();

                for (int j = 0; j < input[i].length(); j++) {
                    if (Character.isAlphabetic(input[i].charAt(j)) || Character.isDigit(input[i].charAt(j))
                            || input[i].charAt(j) == '-' || input[i].charAt(j) == '_') {
                        word.append(input[i].charAt(j));
                    } else {
                        foundSymbol = 1;
                        break;
                    }
                }
                if (foundSymbol == 0) {
                    if (Character.isAlphabetic(word.toString().charAt(0))) {
                        System.out.println(word.toString());
                    }
                }
            }
        }
    }
}
