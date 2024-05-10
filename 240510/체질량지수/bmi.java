import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        
        double bmi = (double) w / ((double) h / 100 * (double) h / 100);
        
        int roundedBMI = (int) Math.floor(bmi);
        
        System.out.println(roundedBMI);
        
        if (roundedBMI > 25) {
            System.out.println("Obesity");
        }
    }
}