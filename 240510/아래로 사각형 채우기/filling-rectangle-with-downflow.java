import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int[][] square = new int[n][n];
        int num = 1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[j][i] = num++;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
    }
}