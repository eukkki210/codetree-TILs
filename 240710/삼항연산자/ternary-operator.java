import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int testScore = scanner.nextInt();
        
        String result = (testScore == 100) ? "pass" : "failure";
        
        System.out.println(result);
        
        scanner.close();
    }
}