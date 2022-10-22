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

        } else {
            System.out.println("Goodbye.");
        }
    }
}



