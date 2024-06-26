import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                sum += grid[i][j];
            }
        }

        System.out.print(sum);

        sc.close();
    }
}