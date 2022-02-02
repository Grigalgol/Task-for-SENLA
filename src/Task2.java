import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            int simple = 2;
            while (simple<= n)
            {
                if (n%simple == 0)
                {
                    System.out.print(simple + " ");
                    n = n / simple;
                }
                else if (simple == 2) simple = 3;
                else simple = simple + 2;
            }
        }
        catch (InputMismatchException e) {
            System.out.println("entered number is not an integer");
        }
    }
}
