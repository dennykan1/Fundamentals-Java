import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DigitsLettersandOtherL5 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String allDigits = read.readLine();

        for (int i = 0; i < allDigits.length(); i++) {
            if (Character.isDigit(allDigits.charAt(i))) {
                System.out.print(allDigits.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i < allDigits.length(); i++) {
            if (Character.isLetter(allDigits.charAt(i))) {
                System.out.print(allDigits.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i < allDigits.length(); i++) {
            if (!Character.isLetter(allDigits.charAt(i)) && (!Character.isDigit(allDigits.charAt(i)))) {
                System.out.print(allDigits.charAt(i));
            }
        }

    }
}
