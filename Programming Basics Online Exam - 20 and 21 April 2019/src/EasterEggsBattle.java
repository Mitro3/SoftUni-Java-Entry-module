import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerEggsNumber = Integer.parseInt(scanner.nextLine());
        int secondPlayerEggsNumber = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {

            if (input.equals("one")) {
                secondPlayerEggsNumber--;
            } else if (input.equals("two")) {
                firstPlayerEggsNumber--;
            }

            if (firstPlayerEggsNumber == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEggsNumber);
                break;
            }
            if (secondPlayerEggsNumber == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayerEggsNumber);
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.%n", firstPlayerEggsNumber);
            System.out.printf("Player two has %d eggs left.", secondPlayerEggsNumber);
        }
    }
}
