package hexlet.code;

import static hexlet.code.Games.getScanner;


public class App {

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n" + "2 - Even\n" + "0 - Exit");

        var choice = getScanner().nextInt();

        System.out.println("Your choice: " + choice);

        if (choice == 1) {
            Games.greeting();

        } else if (choice == 2) {
            Games.even();

        } else {
            System.out.println("Goodbye.");
        }
    }
}

