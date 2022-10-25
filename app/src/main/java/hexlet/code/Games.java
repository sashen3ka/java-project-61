package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;


public final class Games {

    private static Scanner scanner = new Scanner(System.in);
    public static String name;
    private static int result = 0;
    private static int winCounter = 0;
    private static final int correctAnswersForWin = 3;

    public static int randomNumber() {
        return (int) (Math.random() * 100 + 1);
    }

    public static int gcdByEuclidsAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdByEuclidsAlgorithm(b, a % b);
    }

    public static void greeting() {

        System.out.println("Welcome to the Brain Games!\nMay I have your name?");

        name = scanner.next();

        System.out.println("Hello, " + name + "!");
    }


    public static void even() {

        var yes = "yes";
        var no = "no";

        System.out.println("Answer '" + yes + "'" + " if the number is even, otherwise answer '" + no + "' .");

        while (winCounter < correctAnswersForWin) {

            int number = randomNumber();
            System.out.println("Question: " + number);

            String correctAnswer = ((number % 2) == 0) ? "yes" : "no";

            String answer = scanner.next();
            System.out.println("Your answer: " + answer);


            if ((number % 2) == 0 && answer.equals(yes)) {
                ++winCounter;
                System.out.println("Correct!");

            } else if ((number % 2) != 0 && answer.equals(no)) {
                ++winCounter;
                System.out.println("Correct!");

            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                System.out.println("Correct answer was " + "'" + correctAnswer + "'");
                break;
            }

            Engine.congratulations(winCounter, correctAnswersForWin);
        }
    }


    public static void calc() {

        System.out.println("What is the result of the expression?");

        while (winCounter < correctAnswersForWin) {

            int a = randomNumber();
            int b = randomNumber();
            int randomOperator = (int) (Math.random() * 3 + 0) + 1;

            if (randomOperator == 1) {

                char plus = '+';
                result = a + b;

                System.out.println("Question: " + a + " " + plus + " " + b);

                int answer = scanner.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == result) {
                    System.out.println("Correct!");
                    winCounter++;

                } else {
                    Engine.isWrongAnswer(answer, result);
                    break;
                }

            } else if (randomOperator == 2) {

                char minus = '-';
                result = a - b;

                System.out.println("Question: " + a + " " + minus + " " + b);

                int answer = scanner.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == result) {
                    System.out.println("Correct!");
                    winCounter++;

                } else {
                    Engine.isWrongAnswer(answer, result);
                    break;
                }

            } else {

                char multiply = '*';
                result = a * b;

                System.out.println("Question: " + a + " " + multiply + " " + b);

                int answer = scanner.nextInt();
                System.out.println("Your answer: " + answer);

                if (answer == result) {
                    System.out.println("Correct!");
                    winCounter++;

                } else {
                    Engine.isWrongAnswer(answer, result);
                    break;
                }

            }
            Engine.congratulations(winCounter, correctAnswersForWin);
        }
    }


    public static void gsd() {

        System.out.println("Find the greatest common divisor of given numbers.");


        while (winCounter < correctAnswersForWin) {

            int a = randomNumber();
            int b = randomNumber();

            int correctAnswer = gcdByEuclidsAlgorithm(a, b);

            System.out.println("Question: " + a + " " + b);

            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);


            if (answer == correctAnswer) {

                winCounter++;
                System.out.println("Correct!");

            } else {

                Engine.isWrongAnswer(answer, correctAnswer);
                break;
            }

            Engine.congratulations(winCounter, correctAnswersForWin);
        }
    }
 }


