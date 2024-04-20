import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n과 m 입력 받기
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int[][] rectangle = new int[n][m]; // n * m 크기의 배열 생성
        
        // 직사각형 채우기
        int num = 1;
        for (int i = 0; i < n + m - 1; i++) {
            int startX = Math.max(0, i - m + 1);
            int endX = Math.min(i, n - 1);
            
            for (int j = startX; j <= endX; j++) {
                rectangle[j][i - j] = num++;
            }
        }
        
        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}