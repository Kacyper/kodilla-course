import java.util.Scanner;
import java.util.Set;

public class RpsRunner {


    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String playerName;
        int roundsNumber;

        int wins = 0;
        int losses = 0;

        String X = "Do you want to quit the game?";
        String N = "Do you want to quit current game?";


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
        roundsNumber = scanner.nextInt();
        System.out.println();

        int currentRound = 0;


        while (currentRound < roundsNumber) {
            System.out.println("Round number: " + (currentRound + 1) + " out of " + roundsNumber
                    + "Your number of wins: " + wins);

            System.out.println("Your move is: ");
            int playerMove = RpsMove.getMove();
            char selection;
            Set<Character> options = Set.of('1', '2', '3', 'X', 'N');

            if (playerMove.e)

//
//            do {
//                selection = scanner.nextLine().charAt(0);
//
//                if (!options.contains(selection))
//                    System.out.println("Wrong");
//            } while (!options.contains(selection));
//
//            if (selection == 'x')
//                break;
//        }
    }
}



//
//            //is it time to quit
//            if (playerMove.equals(X)) {
//                break;
//            }
//            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
//                System.out.println("Your move is wrong");
//            } else {
//                //computer move
//                int randomMove = (int)(Math.random() + 3);
//                String computerMove = "";
//                if (randomMove == 0) {
//                    computerMove = "rock";
//                } else if (randomMove == 1) {
//                    computerMove = "paper";
//                } else {
//                    computerMove = "scissors";
//                }
//                System.out.println("Computer's move: " + computerMove);
//
//                //who won
//                if (playerMove.equals(computerMove)){
//                    System.out.println("It's a tie");
//                } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
//                        (playerMove.equals("scissors") && computerMove.equals("paper")) ||
//                        (playerMove.equals("paper") && computerMove.equals("rock"))) {
//                    System.out.println("You win!");
//                    wins++;
//                } else {
//                    System.out.println("You lost");
//                    losses++;
//                }
//            }
//
//            //Score
//            System.out.println(playerName + " has won: " + wins + " games!");
//            System.out.println(playerName + " has lost: " + losses + " games!");
//        }
//        System.out.println("thanks for playing");
//        }
//
//        //loop how many times to play
////        while (true) {
////            System.out.println("Enter your move");
//
//
//
//
//            //verify player's move
//
//
////        //Who won games
////        if (wins > losses) {
////            System.out.println("You won more games than lost");
////        } else if (wins < losses) {
////            System.out.println("You lost more games than you won.");
////        } else {
////            System.out.println("Number of wins and losses is equal.");
////        }





//
//    }
//
//
