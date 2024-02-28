import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;
        int sum_odd = 0;
        int sum_even = 0;
        int answer = 0;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (count >= arr.length) {
                break;
            }
            arr[count++] = num;
        }

        for (int i = 0; i < count; i++) {
            if (i % 2 == 1) {
                sum_odd += arr[i];
            } else {
                sum_even += arr[i];
            }
        }

        answer = Math.abs(sum_odd - sum_even);

        System.out.println(answer);
    }
}