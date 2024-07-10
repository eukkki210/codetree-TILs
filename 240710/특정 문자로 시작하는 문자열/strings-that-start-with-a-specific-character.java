import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        String character = scanner.nextLine();

        int count = 0;
        int totalLength = 0;

        for (String str : strings) {
            if (str.startsWith(character)) {
                count++;
                totalLength += str.length();
            }
        }

        double averageLength = (double) totalLength / count;

        System.out.printf("%d %.2f\n", count, averageLength);

        scanner.close();
    }
}