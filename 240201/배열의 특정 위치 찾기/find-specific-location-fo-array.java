import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int evenSum = 0;
        for (int i = 1; i < 10; i += 2) {
            evenSum += numbers[i];
        }

        int multipleOf3Sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 3 == 0) {
                multipleOf3Sum += num;
                count++;
            }
        }

        double averageOf3 = (double) multipleOf3Sum / count;

        System.out.printf("%d %.1f\n", evenSum, averageOf3);

        scanner.close();
    }
}