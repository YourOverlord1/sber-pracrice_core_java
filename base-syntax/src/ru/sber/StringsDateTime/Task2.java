package ru.sber.StringsDateTime;
import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String str = "в деревне было много садов, а осенью поспевали яблоки и груши";
        char result = firstNonRepeatingChar(str);
        System.out.println(result);
    }

    public static char firstNonRepeatingChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '0';
    }
}
