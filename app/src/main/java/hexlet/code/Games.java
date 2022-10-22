package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;


public final class Games {

    private static Scanner scanner = new Scanner(System.in);
    private static String name;
    private static int result = 0;
    private static int winCounter = 0;
    private static final int correctAnswersForWin = 3;

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

            final int randomNumber = (int) (Math.random() * 100 + 1);
            System.out.println("Question: " + randomNumber);

            String correctAnswer = ((randomNumber % 2) == 0) ? "yes" : "no";

            String answer = scanner.next();
            System.out.println("Your answer: " + answer);


            if ((randomNumber % 2) == 0 && answer.equals(yes)) {
                ++winCounter;
                System.out.println("Correct!");

            } else if ((randomNumber % 2) != 0 && answer.equals(no)) {
                ++winCounter;
                System.out.println("Correct!");

            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(. " );
                System.out.println("Correct answer was " + "'" + correctAnswer + "'");
                break;
            }
        }
        if (winCounter == correctAnswersForWin - 1) {
            System.out.println("Congratulations, " + name + "!");
        }
    }


        public static void calc() {

            System.out.println("What is the result of the expression?");


            String correctAnswer;

            String[] operators = {"+", "-", "*"};
            int x = new Random().nextInt(operators.length - 1);


            while (winCounter < correctAnswersForWin) {

                int a = (int) (Math.random() * 100 + 1);
                int b = (int) (Math.random() * 100 + 1);
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
                        System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                        System.out.println("Correct answer was " + "'" + result + "'");
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
                        System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                        System.out.println("Correct answer was " + "'" + result + "'");
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
                        System.out.print("'" + answer + "'" + " is wrong answer ;(. ");
                        System.out.println("Correct answer was " + "'" + result + "'");
                        break;
                    }
                }
                System.out.println("Congratulations, " + name + "!");
             }
            }

        }
