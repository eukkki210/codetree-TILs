import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        if (str.length() >= 10) {
            System.out.println(str.substring(2, 10));
        }
    }
}