import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 격자의 크기 n 입력 받기
        int n = scanner.nextInt();

        // n x n 크기의 이차원 배열 생성
        int[][] grid = new int[n][n];

        int num = 1; // 채워넣을 숫자 초기값 설정

        // 오른쪽 아래에서부터 시작하여 위아래로 번갈아가면서 숫자를 채워넣음
        for (int i = n - 1; i >= 0; i--) {
            if ((n - i) % 2 == 1) { // 번갈아가면서 위에서 아래로 채움
                for (int j = n - 1; j >= 0; j--) {
                    grid[j][i] = num++;
                }
            } else { // 번갈아가면서 아래에서 위로 채움
                for (int j = 0; j < n; j++) {
                    grid[j][i] = num++;
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}