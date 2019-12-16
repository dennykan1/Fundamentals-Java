import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplyBigNumberEx5 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String bigNumber = read.readLine().replaceFirst("^0+(?!$)", "");

        char digit = read.readLine().charAt(0);
        if (digit == '0') {
            System.out.println("0");
            return;
        }

        String result = "";
        StringBuilder output = new StringBuilder();
        int resedue = 0;

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            long bigDigit = bigNumber.charAt(i) - '0';
            result = (bigDigit * (digit - '0')) + resedue + "";
            if (result.length() == 1) {
                resedue = 0;
                output.append(result);
            } else {
                resedue = result.charAt(0) - '0';
                output.append(result.charAt(1) - '0');
            }
        }

        if (resedue != 0) {
            output.append(resedue);
            output.reverse();
        } else {
            output.reverse();
        }

        System.out.println(output.toString());
    }
}

