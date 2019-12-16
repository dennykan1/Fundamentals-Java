package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class CountCharsinStringEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String texts = String.join("", read.readLine().split("\\s+"));
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < texts.length(); i++) {

            char symbol = texts.charAt(i);
            counts.putIfAbsent(symbol, 0);
            counts.put(symbol, counts.get(symbol) + 1);
        }
        counts.forEach((key, value) ->
                System.out.println(String.format("%c -> %d", key, value)));


    }

}
