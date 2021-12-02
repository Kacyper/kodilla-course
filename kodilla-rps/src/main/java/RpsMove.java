import java.util.Scanner;

public class RpsMove {

    public static int getMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your move:");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "1":
                    return Move.ROCK;
                case "2":
                    return Move.PAPER;
                case "3":
                    return Move.SCISSORS;
            }
            System.out.println("Wrong move, try again.");
        }
    }
}