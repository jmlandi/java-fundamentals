package Conditions;

import java.util.Scanner;

public class Ternaries {
    public static void main(String[] args) {
        /*
            Ternaries are an easy way to write if/else inline for simple validations.
            syntax: variable = (condition) ? valueIfTrue : valueIfFalse
        */

        // Input user info
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many missions this ninja did?");
        short missionNumber = scanner.nextShort();
        scanner.close();

        // Ternary usage
        String message = (missionNumber > 10) ? "This ninja is senior!" : "This ninja has no required experience.";
        System.out.println(message);

    }
}
