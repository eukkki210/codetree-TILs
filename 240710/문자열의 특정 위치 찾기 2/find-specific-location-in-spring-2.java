import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "grape", "blueberry", "orange"};
        
        Scanner scanner = new Scanner(System.in);
        
        char inputChar = scanner.next().charAt(0);
        
        int count = 0;
        
        for (String fruit : fruits) {
            if ((fruit.length() >= 3 && fruit.charAt(2) == inputChar) || 
                (fruit.length() >= 4 && fruit.charAt(3) == inputChar)) {
                System.out.println(fruit);
                count++;
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}