import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            double horizontalSum = 0;
            for (int j = 0; j < 4; j++) {
                horizontalSum += numbers[i][j];
            }
            double horizontalAverage = horizontalSum / 4;
            System.out.print(String.format("%.1f ", horizontalAverage));
        }
        System.out.println();

        for (int j = 0; j < 4; j++) {
            double verticalSum = 0;
            for (int i = 0; i < 2; i++) {
                verticalSum += numbers[i][j];
            }
            double verticalAverage = verticalSum / 2;
            System.out.print(String.format("%.1f ", verticalAverage));
        }
        System.out.println();

        double overallSum = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                overallSum += numbers[i][j];
            }
        }
        double overallAverage = overallSum / 8;
        System.out.println(String.format("%.1f", overallAverage));

        sc.close();
    }
}