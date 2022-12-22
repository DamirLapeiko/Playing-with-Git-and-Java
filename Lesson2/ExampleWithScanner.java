package Lesson2;
import java.util.Scanner;

public class ExampleWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
   //   System.out.println(scanner.nextLine()); // 1 вариант

        String input = scanner.nextLine(); // 2 вариант
        System.out.println(input); // 2 вариант
        }
    }
