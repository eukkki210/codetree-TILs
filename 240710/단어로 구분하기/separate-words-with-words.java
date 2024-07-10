import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] words = inputLine.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}