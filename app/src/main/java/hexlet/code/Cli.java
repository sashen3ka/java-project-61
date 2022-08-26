package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void meeting() {
        System.out.println("May I have your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hallo, " + name + "!");
    }
}

