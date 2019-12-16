package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class AMinerTaskEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Integer> resourceQtty = new LinkedHashMap<>();
        String input = "";

        while (!"stop".equals(input = read.readLine())) {
            String resource = input;
            int qtty = Integer.parseInt(read.readLine());

            resourceQtty.putIfAbsent(resource, 0);
            resourceQtty.put(resource, resourceQtty.get(resource) + qtty);

        }

        resourceQtty.entrySet().forEach( e -> {
            System.out.printf("%s -> %d\n", e.getKey(), e.getValue());
        });

    }
}
