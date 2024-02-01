import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int evenSum = 0;
        for (int i = 1; i < 10; i += 2) {
            evenSum += arr[i];
        }

        int mul3Sum = 0;
        int cnt = 0;
        for (int num : arr) {
            if (num % 3 == 0) {
                mul3Sum += num;
                cnt++;
            }
        }

        double avrg = (double) mul3Sum / cnt;

        System.out.printf("%d %.1f\n", evenSum, avrg);

        sc.close();
    }
}