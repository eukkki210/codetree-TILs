import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a + b + c;
        int avrg = sum / 3;
        int sum_minus_avrg = sum - avrg;

        System.out.println(sum);
        System.out.println(avrg);
        System.out.println(sum_minus_avrg);
    }
}