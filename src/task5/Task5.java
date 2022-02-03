package task5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        int n = 4; //число вещей
        int k = 4; //объем сейва
        Safe[][] safe = new Safe[n + 1][k + 1];
        //массив вещей
        Thing[] things = {new Thing(1, 15, "наушники"), new Thing(4, 30, "ноутбук"),
                new Thing(3, 20, "телефон"), new Thing(3, 18, "часы")};

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                if (i == 0 || j == 0) {
                    safe[i][j] = new Safe(new Thing[]{}, 0);
                } else if (i == 1) {
                    safe[1][j] = things[0].getVolume() <= j ? new Safe(new Thing[]{things[0]}, things[0].getValue()) : new Safe(new Thing[]{}, 0);
                } else {
                    if (things[i - 1].getVolume() > j)
                        safe[i][j] = safe[i - 1][j];
                    else {
                        int newValue = things[i - 1].getValue() + safe[i - 1][j - things[i - 1].getVolume()].getCommonValue();
                        if (safe[i - 1][j].getCommonValue() > newValue)
                            safe[i][j] = safe[i - 1][j];
                        else {
                            safe[i][j] = new Safe(Stream.concat(Arrays.stream(new Thing[]{things[i - 1]}),
                                    Arrays.stream(safe[i - 1][j - things[i - 1].getVolume()].getThings())).toArray(Thing[]::new), newValue);
                        }
                    }
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                System.out.print(safe[i][j].getDescription() + " ");
            }
            System.out.print("\n");
        }

        List<Safe> lastColumn = Arrays.stream(safe).map(row -> row[row.length - 1]).collect(Collectors.toList());
        Safe safeMaxValue = lastColumn.stream().max(Comparator.comparing(Safe::getCommonValue)).orElse(new Safe(null, 0));
        System.out.println(safeMaxValue.getDescription());
    }
}
