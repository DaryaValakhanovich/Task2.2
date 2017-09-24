import java.util.Scanner;

public class FibonacciNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number = scanner.nextInt();
            int x1 = 0;
            int x2 = 1;
            String result = "Fibonacci Numbers: ";
            while (number > x2){
                int x = x2;
                x2 += x1;
                x1 = x;
                result += x1 + " ";
            }
            System.out.println(result);
        }

    }

