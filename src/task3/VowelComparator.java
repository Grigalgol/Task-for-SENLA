package task3;

import java.util.Comparator;

public class VowelComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return countOfVowels(o2) - countOfVowels(o1) ;
    }

    private int countOfVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("аеёиоуыыэюя".indexOf(s.charAt(i)) != -1)
                count++;
        }
        return count;
    }
}
