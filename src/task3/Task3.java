package task3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] array = str.toLowerCase().trim().split(" ");

        //подсчет гласных букв
        Pattern v = Pattern.compile("(?iu)[аеёиоуыыэюя]");
        Matcher m = v.matcher(str);
        int vCount = 0;
        while (m.find()) {
            vCount++;
        }
        System.out.println("Всего гласных: " + vCount + "\n");

        //сортировка по количеству гласных букв
        Arrays.sort(array, new VowelComparator());

        //выводим отсортированный массив слов и делаем каждую первую гласную букву большой
        for (String s: array) {
            for (int i = 0; i < s.length(); i++) {
                if ("аеёиоуыыэюя".indexOf(s.charAt(i)) != -1) {
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                    s = sb.toString();
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
