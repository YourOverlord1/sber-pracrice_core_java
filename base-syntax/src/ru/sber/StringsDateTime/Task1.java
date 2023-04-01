package ru.sber.StringsDateTime;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args){
        String str = "aabbbcccc";
        Map<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hashMap.containsKey(c)) {
                int count = hashMap.get(c);
                hashMap.put(c, count + 1);
            }
            else {
                hashMap.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}