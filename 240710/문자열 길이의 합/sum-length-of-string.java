import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int totalLength = 0;
        int countAStart = 0;

        for (int i = 0; i < n; i++) {
            String str = scanner.nextLine();
            totalLength += str.length();
            if (str.startsWith("a")) {
                countAStart += 1;
            }
        }

        System.out.println(totalLength + " " + countAStart);

        scanner.close();
    }
}