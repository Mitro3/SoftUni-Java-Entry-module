import java.util.Scanner;

public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
