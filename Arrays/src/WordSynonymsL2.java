import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordSynonymsL2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(read.readLine());

        Map<String, List<String>> wordMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {

            String keyFirstWord = read.readLine();
            String valueSecondWord = read.readLine();

            wordMap.putIfAbsent(keyFirstWord, new ArrayList<>());
            wordMap.get(keyFirstWord).add(valueSecondWord);
        }

        String pattern = "%s - %s";
        for (Map.Entry<String, List<String>> keyValue : wordMap.entrySet()) {

            String key = keyValue.getKey();
            String value = String.join(", " , keyValue.getValue());
            System.out.println(String.format(pattern, key, value));
        }

    }
}
