package Conditions;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
            Deal with multiple specific conditions in one block of code.
        */

        // Collect user information.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose a character: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        int response = scanner.nextInt();
        scanner.close();

        // From "response" value switch between cases what to do.
        switch (response) {
            case 1:
                System.out.println("Naruto Uzumaki selected");
                break;
            case 2:
                System.out.println("Sasuke Uchiha selected");
                break;
            case 3:
                System.out.println("Sakura Haruno selected");
                break;
            default:
                System.out.println("Ninja not found! Try again :(");
                break;
        }
    }
}
