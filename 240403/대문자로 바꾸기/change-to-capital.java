import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] input = new char[5][3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = sc.next().charAt(0);
            }
        }

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length; j++) {
                char upper = Character.toUpperCase(input[i][j]);
                System.out.print(upper + " ");
            }
            System.out.println();
        }
    }
}