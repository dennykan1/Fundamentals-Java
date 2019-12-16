package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoftUniParking5 {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        int numberComands = Integer.parseInt(read.readLine());
        Map<String, String> nameLicence = new LinkedHashMap<>();

        for (int i = 0; i < numberComands; i++) {
            String[] commands = read.readLine().split("\\s+");

            if (commands[0].equals("register")) {
                String name = commands[1];
                String plate = commands[2];
                if (nameLicence.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s\n", plate);
                } else {
                    nameLicence.putIfAbsent(name, plate);
                    System.out.printf("%s registered %s successfully\n", name, plate);
                }
            }
            if (commands[0].equals("unregister")) {
                String name = commands[1];
                if (nameLicence.containsKey(name)) {
                    System.out.printf("%s unregistered successfully\n", name);
                    nameLicence.remove(name);
                } else {
                    System.out.printf("ERROR: user %s not found\n", name);
                }
            }
        }

        nameLicence.forEach((key, value) -> System.out.println(key + " => " + value));
    }
}
