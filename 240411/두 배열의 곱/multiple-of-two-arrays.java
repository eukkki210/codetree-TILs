import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j]*arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}