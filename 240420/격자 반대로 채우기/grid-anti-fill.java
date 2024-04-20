import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // n 입력 받기
        int n = scanner.nextInt();
        
        int[][] square = new int[n][n]; // n * n 크기의 배열 생성
        
        // 정사각형 채우기
        int num = 1;
        for (int j = n-1; j >= 0; j--) {
            if (j % 2 == 0) { // 짝수 열은 아래쪽에서 위쪽으로 증가
                for (int i = 0; i < n; i++) {
                    square[i][j] = num++;
                }
            } else { // 홀수 열은 위쪽에서 아래쪽으로 증가
                for (int i = n - 1; i >= 0; i--) {
                    square[i][j] = num++;
                }
            }
        }
        
        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}