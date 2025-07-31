package DataStructures;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        /*
            Array is a data structure to store multiple variables with the same type in sequence inside the memory.
            They are accessed by indexes (starting from 0), for example, myArray[0] get the first value. Java reserve
            the memory space to create an array, so its necessary to specify how many items you'll have.

            Important: when you initialize an array, the values of the array that are not set depends on the type.
            For example, "int[] numbers = new int[3]" without setting "numbers[3]", if I print "numbers[0]" the output
            will be "0", due to array type. So basically, initialized arrays by type got the respective values:
            - String, char = null
            - boolean = false
            - int, short, long = 0
            - boolean, double = 0.0
        */

        Scanner scanner = new Scanner(System.in);

        // Create an empty array with 3 slots
        String[] ninjas = new String[3];

        // Iterate to collect and save names/strings in the array using a for loop
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("[NINJA " + (i + 1) + "] Type the ninja name: ");
            ninjas[i] = scanner.nextLine();
        }
        scanner.close();

        System.out.println("    NINJA TEAM:");
        // Print the array using a for loop to run through the indexes
        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("[NINJA " + (i + 1) + "]: " + ninjas[i]);
        }
    }
}
