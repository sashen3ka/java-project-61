package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static Scanner scanner = new Scanner(System.in);

    public static void run() {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GSD
                5 - Progression
                0 - Exit""");

        var choice = scanner.nextInt();

        System.out.println("Your choice: " + choice);

        if (choice == 1) {
            Games.greeting();

        } else if (choice == 2) {
            Games.greeting();
            Games.even();

        } else if (choice == 3) {

            Games.greeting();
            Games.calc();

        } else if (choice == 4) {

            Games.greeting();
            Games.gsd();

        } else if (choice == 5) {

            Games.greeting();
            Games.progression();

        } else {
            System.out.println("Goodbye.");
        }
    }

    public static void congratulations(int winCounter, int correctAnswersForWin) {
        if (winCounter == correctAnswersForWin) {
            System.out.println("Congratulations, " + Games.name + "!");
        }
    }

    public static void isWrongAnswer(int answerOfUser, int correctAnswer) {

        System.out.print("'" + answerOfUser + "'" + " is wrong answer ;(. ");
        System.out.println("Correct answer was " + "'" + correctAnswer + "'" + ".");
        System.out.println("Let's try again, " + Games.name + "!");
    }
}



