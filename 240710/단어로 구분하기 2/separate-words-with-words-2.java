import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] words = inputLine.split(" ");

        for (int i = 0; i < words.length; i += 2) {
            System.out.println(words[i]);
        }

        scanner.close();
    }
}