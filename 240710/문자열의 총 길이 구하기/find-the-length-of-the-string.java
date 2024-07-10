import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputLine = scanner.nextLine();
        
        String[] words = inputLine.split(" ");
        
        int totalLength = 0;
        
        for (String word : words) {
            totalLength += word.length();
        }
        
        System.out.println(totalLength);
        
        scanner.close();
    }
}