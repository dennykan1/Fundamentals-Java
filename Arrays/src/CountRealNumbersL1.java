import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountRealNumbersL1 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        double[] nums = Arrays.stream(read.readLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> someMap = new TreeMap<>();
        for (double num : nums) {
            if (!someMap.containsKey(num)) {
                someMap.put(num, 0);
            }
            int oldValue = someMap.get(num);
            someMap.put(num, oldValue + 1);
        }

        String pattern = "%.0f -> %d";
        for (Map.Entry<Double, Integer> keyValuePair : someMap.entrySet()) {
            System.out.println(String.format(pattern, keyValuePair.getKey(), keyValuePair.getValue()));
        }

    }
}
