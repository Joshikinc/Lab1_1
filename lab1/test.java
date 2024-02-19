import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после считывания числа

        String shortestString = null;
        int shortestLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку #" + (i + 1) + ": ");
            String input = scanner.nextLine();

            if (input.length() < shortestLength) {
                shortestString = input;
                shortestLength = input.length();
            }
        }

        System.out.println("Самая короткая строка: " + shortestString);
        System.out.println("Длина строки: " + shortestLength);
    }
}
