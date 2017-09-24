import java.util.Scanner;

public class FibonacciNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        int x1 = 0;
        int x2 = 1;
        String result = "Fibonacci Numbers: ";
        System.out.println();


    }
        public static void Result(int x1, int x2, int number) {
            if (number > x2) {
                return;
            }
            System.out.println(x2 + " ");
            Result(x2, (x2 + x1), number);
        }

    }


