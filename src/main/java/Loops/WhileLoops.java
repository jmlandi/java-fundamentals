package Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        /*
            Repeat until the condition became false, iterating over the code.
            syntax: while (condition is true) {repeat this block of code}
        */

        // Input user information and set initial value
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many clones Naruto will do?");
        int numberOfClones = scanner.nextInt();
        scanner.close();
        int initialNumberOfClones = 0;

        // Until initialNumberOfClones reach the number of clones Naruto will do, the code will repeat
        while (initialNumberOfClones < numberOfClones) {
            initialNumberOfClones++;
            System.out.println("Clone " + initialNumberOfClones + " created!");
        }

    }
}
