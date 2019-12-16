package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CoursesEx6 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> courseStudent = new LinkedHashMap<>();
        String input;

        while (!"end".equals(input = read.readLine())) {
            String[] courseSt = input.split(" : ");
            String course = courseSt[0];
            String name = courseSt[1];

            courseStudent.putIfAbsent(course, new ArrayList<>());
            courseStudent.get(course).add(name);
        }

        courseStudent.entrySet().stream().sorted((a, b) -> Integer.compare(b.getValue().size(), a.getValue().size()))
                .forEach(entry -> {
                    System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().size());
                    Collections.sort(entry.getValue());
                    entry.getValue().forEach(e -> System.out.printf("-- %s\n", e));
                });

    }
}
