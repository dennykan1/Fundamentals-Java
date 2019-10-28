import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoginEx {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String user = read.readLine();
        String pass = read.readLine();

        int count = 0;
        String reverse = "";
        for (int i = user.length() - 1; i >= 0; i--) {
            reverse += user.charAt(i);
        }

        while (!pass.equals(reverse)) {
            count++;
            if (count >= 4) {
                System.out.printf("User %s blocked!", user);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
            pass = read.readLine();
        }

        if (pass.equals(reverse)) {
            System.out.printf("User %s logged in.", user);
        }
    }
}
