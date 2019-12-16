import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrencesL3 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        List<String> words = Arrays.stream(read.readLine().toLowerCase().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String word : words) {
            counts.putIfAbsent(word, 0);
            counts.put(word, counts.get(word) + 1);
        }

        ArrayList<String> oddWords = new ArrayList<>();
        counts.forEach((key, value) -> {
            if (value % 2 != 0) {
                oddWords.add(key);
            }
        });

        System.out.print(String.join(", ", oddWords));

    }
}

