import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleofNumbersEX {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(read.readLine());

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
