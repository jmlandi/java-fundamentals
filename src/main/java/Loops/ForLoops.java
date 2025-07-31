package Loops;

import java.util.Scanner;

public class ForLoops {

    /*
        Repeat until the condition is false, iterating over the code.
        syntax: for (iterator = minNumber; iterator < maxNumber; iterator++) {repeat this block of code}
    */
    public static void main(String[] args) {
        // Input user information and set initial value
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many clones Naruto will do?");
        int numberOfClones = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < numberOfClones; i++){
            System.out.println("Clone " + (i + 1) + " created!");
        }
    }


}
