public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr2d = new int[5][5];

        // 1. 첫 번째 행에 전부 숫자 1을 채웁니다.
        for (int j = 0; j < n; j++) {
            arr2d[0][j] = 1;
            arr2d[j][0] = 1;
        }

        // 2. 두 번째 행부터 마지막 행까지 전부 숫자를 채웁니다.
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                arr2d[i][j] = arr2d[i - 1][j] + arr2d[i][j - 1];
            }
        }

        // 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}