import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        double avrg = (double) sum / 2;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avrg);
    }
}