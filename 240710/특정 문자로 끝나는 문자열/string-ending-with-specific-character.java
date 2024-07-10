import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strings = new String[10];
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        String character = scanner.nextLine();

        boolean found = false;

        for (String str : strings) {
            if (str.endsWith(character)) {
                System.out.println(str);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }

        scanner.close();
    }
}