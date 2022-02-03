import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws java.lang.Exception {
        String[] arr1 = {
                "  *    ",
                "* *    ",
                "  *    ",
                "  *    ",
                "  *    ",
                "  *    ",
                "* * *  "
        };

        String[] arr2 = {
                "  **   ",
                "*   *  ",
                "    *  ",
                "   *   ",
                "  *    ",
                " *     ",
                "* * *  "
        };

        String[] arr3 = {
                "  **   ",
                "*   *  ",
                "    *  ",
                "  **   ",
                "    *  ",
                "*   *  ",
                "  **   "
        };

        String[] arr4 = {
                "*   *  ",
                "*   *  ",
                "*   *  ",
                " ****  ",
                "    *  ",
                "    *  ",
                "    *  "
        };

        String[] arr5 = {
                " ****  ",
                "*      ",
                "*      ",
                "  **   ",
                "    *  ",
                "*   *  ",
                "  **   "
        };

        String[] arr6 = {
                "   *   ",
                " *     ",
                "*      ",
                "****   ",
                "*   *  ",
                "*   *  ",
                "****   "
        };

        String[] arr7 = {
                "*****  ",
                "    *  ",
                "   *   ",
                "   *   ",
                "   *   ",
                "   *   ",
                "   *   "
        };

        String[] arr8 = {
                " ***   ",
                "*   *  ",
                "*   *  ",
                " ***   ",
                "*   *  ",
                "*   *  ",
                " ***   "
        };

        String[] arr9 = {
                " ****  ",
                "*   *  ",
                "*   *  ",
                " ****  ",
                "    *  ",
                "   *   ",
                "  *    "
        };

        String[] arr0 = {
                " ***   ",
                "*   *  ",
                "*   *  ",
                "*   *  ",
                "*   *  ",
                "*   *  ",
                " ***   "
        };

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] numbers = str.split("");
        String result = "";

        //нахождение максимального числа
        int max = -1;
        for (int k = 0; k < str.length(); k++) {
            int x = Integer.parseInt(numbers[k]);
            if (x > max) max = x;
        }

        //заменим  большем числе * на соответствующее число
        for(int l = 0; l < 7; l++)
        switch (max) {
            case 0:
                arr0[l].replace("*", "0");
                break;
            case 1:
                arr1[l].replace("*", "1");
                break;
            case 2:
                arr2[l].replace("*", "2");
                break;
            case 3:
                arr3[l].replace("*", "3");
                break;
            case 4:
                arr4[l].replace("*", "4");
                break;
            case 5:
                arr5[l].replace("*", "5");
                break;
            case 6:
                arr6[l].replace("*", "6");
                break;
            case 7:
                arr7[l].replace("*", "7");
                break;
            case 8:
                arr8[l].replace("*", "8");
                break;
            case 9:
                arr9[l].replace("*", "9");
                break;
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < str.length(); j++) {
                int x = Integer.parseInt(numbers[j]);
                switch (x) {
                    case 0:
                        result += arr0[i];
                        break;
                    case 1:
                        result += arr1[i];
                        break;
                    case 2:
                        result += arr2[i];
                        break;
                    case 3:
                        result += arr3[i];
                        break;
                    case 4:
                        result += arr4[i];
                        break;
                    case 5:
                        result += arr5[i];
                        break;
                    case 6:
                        result += arr6[i];
                        break;
                    case 7:
                        result += arr7[i];
                        break;
                    case 8:
                        result += arr8[i];
                        break;
                    case 9:
                        result += arr9[i];
                        break;
                }
            }
            result += "\n";
        }
        System.out.println(result);
    }
}

