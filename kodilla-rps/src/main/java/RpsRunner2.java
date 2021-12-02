import java.util.Scanner;

public class RpsRunner2 {
    public static void main(String[] args) {
        String playerName;
        int roundsNumber;
        int randomMove = (int)(Math.random() + 3);
        String opponentMove = "";
        int currentRound = 0;









        Scanner scanner = new Scanner(System.in);













        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println();
        System.out.println("Here's how to play.");
        System.out.println();
        System.out.println("You have to press:");
        System.out.println();
        System.out.println("""
                1 - for Rock
                2 - for Paper
                3 - for Scissors
                X - to exit
                N - to start a new game""");
        System.out.println();
        System.out.println("Let's start");
        System.out.println();
        System.out.println("What's your name?");
        playerName = scanner.nextLine();
        System.out.println();
        System.out.println("How many rounds would you like to play to win the game?");
        roundsNumber = Integer.parseInt(scanner.nextLine());
        System.out.println();

        if (randomMove == 0) {
            opponentMove = "rock";
        } else if (randomMove == 1) {
            opponentMove = "paper";
        } else {
            opponentMove = "scissors";
        }



//        while (currentRound < roundsNumber) {
//            System.out.println("Round number: " + (currentRound + 1) + " out of " + roundsNumber);
//
//            System.out.println("What's your move?");
//            char selection;
//            Set<Character> options = Set.of('1', '2', '3', 'x', 'n');
//
//            do {
//                selection = scanner.nextLine().charAt(0);
//                if (!options.contains(selection))
//                    System.out.println("Wrong number");
//            } while (!options.contains(selection));
//
//            if (selection == 1)
//                break;
//
//
//        }


        System.out.println("Name is: " + playerName);
        System.out.println("Number of rounds: " + roundsNumber);
        System.out.println("Opponent move: " + opponentMove);


    }
}
