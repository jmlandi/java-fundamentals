package Scanners;

import java.util.Scanner;

public class UserScan {
    public static void main(String[] args) {
        /*
         Scanner is a Java class with methods to get external information into the application.
        */

        // Instantiate new scanner.
        Scanner textBox = new Scanner(System.in);

        // Collect the value from terminal/console and print it.
        System.out.println("[QUESTION 1] Type the ninja name: ");
        String name = textBox.nextLine();
        System.out.println("the ninja name is " + name);

        // Collect the value from terminal/console and validate it.
        System.out.println("[QUESTION 2] Type the ninja age: ");
        int age = textBox.nextInt(); // For types different from Strings, use .next{dataType}()
        if (age > 18) {
            System.out.println("This ninja is an adult, he/she can work as ninja!");
        } else {
            System.out.println("This ninja is too young, keep working out!");
        }

        // Close scanner to avoid memory leak.
        textBox.close();
    }
}
