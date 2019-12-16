import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Largest3NumbersL5 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = Arrays.stream(read.readLine()
                .split("\\s+"))
                .map( n -> Integer.parseInt(n))
                .sorted(Collections.reverseOrder())
                .limit(3)
                .map( n -> String.valueOf(n))
                .collect(Collectors.joining(" "));

        System.out.println(result);

    }

}
