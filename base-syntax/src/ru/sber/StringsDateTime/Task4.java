package ru.sber.StringsDateTime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String str = "abc, abdc abcd qwertyabc";
        String subStr = "abc";

        // создаем регулярное выражение для поиска подстроки
        Pattern pattern = Pattern.compile(subStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println(count);
    }
}