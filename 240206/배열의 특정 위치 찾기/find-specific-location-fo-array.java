import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        int evenSum = 0;
        int mul3Sum = 0;
        int mul3Cnt = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                evenSum += arr[i - 1];
            }
            if (i % 3 == 0) {
                mul3Sum += arr[i - 1];
                mul3Cnt++;
            }
        }

        double mul3Avg = (double) mul3Sum / mul3Cnt;

        System.out.printf("%d %.1f\n", evenSum, mul3Avg);

        scanner.close();
    }
}