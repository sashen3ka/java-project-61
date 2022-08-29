package hexlet.code;

import java.util.Scanner;

public class Games {
    private static Scanner scanner = new Scanner(System.in);
    private static String name;

    public static Scanner getScanner() {
        return scanner;
    }
    public static String getName() {
        return name;
    }


    public static void greeting() {

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");

        name = scanner.next();

        System.out.println("Hello, " + getName() + "!");
    }


    public static void even() {

        var yes = "yes";
        var no = "no";

        Games.greeting();

        System.out.println("Answer '" + yes + "'" + " if the number is even, otherwise answer '" + no + "' .");

        int winCounter = 0;
        final int correctAnswersForWin = 3;
        String correctAnswer = null;
        while (winCounter < correctAnswersForWin) {

            final int randomNumber = (int) (Math.random() * 100 + 1);
            System.out.println("Question: " + randomNumber);

            correctAnswer = ((randomNumber % 2) == 0) ? "yes" : "no";

            String answer = scanner.next();
            System.out.println("Your answer: " + answer);

            if ((randomNumber % 2) == 0 && answer.equals(yes)) {
                ++winCounter;
                System.out.println("Correct!");

            } else if ((randomNumber % 2) != 0 && answer.equals(no)) {
                ++winCounter;
                System.out.println("Correct!");

            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was '" + correctAnswer + "'.");
                break;
            }
        }

        if (winCounter == correctAnswersForWin) {
            System.out.println("Congratulations, " + getName() + "!");
        }
    }
}
