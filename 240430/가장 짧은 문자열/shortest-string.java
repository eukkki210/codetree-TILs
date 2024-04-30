import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        
        int maxLength = Math.max(Math.max(str1.length(), str2.length()), str3.length());
        int minLength = Math.min(Math.min(str1.length(), str2.length()), str3.length());
        
        System.out.println(maxLength - minLength);
    }
}