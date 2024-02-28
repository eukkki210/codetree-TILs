import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int count = 0;
        int answer = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            arr[count++] = num;
        }

        for (int i = count - 1; i >= Math.max(0, count - 3); i--) {
            answer += arr[i];
        }
        
        System.out.println(answer);
    }
}