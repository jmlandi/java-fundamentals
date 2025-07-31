package ChallengeTwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            The Hokage asked you to create a system to add ninjas and list all ninjas added. Utilize arrays
            to store ninja names, switch case to navigate through the menu, loops to iterate over it, conditions
            to handle the options in it and validate the number of ninjas. The user may exit the program anytime.
        */

        Scanner scanner = new Scanner(System.in);
        String[] ninjas = new String[4];
        boolean systemAvailable = true;
        short input;

        while (systemAvailable) {
            System.out.print("\n===== NINJA MENU =====\n1. Add Ninja\n2. List Ninja(s)\n3. exit\nSelect one option: ");
            input = scanner.nextShort();
            scanner.nextLine();
            switch (input) {
                case 1:
                    System.out.println("Type the ninja name to be added or only '3' to exit to menu: ");
                    String newNinja = scanner.nextLine();
                    if (newNinja.equals("3")) {
                        break;
                    }
                    boolean newNinjaAdded = false;
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] == null) {
                            ninjas[i] = newNinja;
                            newNinjaAdded = true;
                            break;
                        }
                    }
                    if (!newNinjaAdded) {
                        System.out.println("No slot available, your ninja team is full!");
                    }
                    break;
                case 2:
                    for (int i = 0; i < ninjas.length; i++) {
                        if (ninjas[i] != null) {
                            System.out.println("[NINJA " + (i + 1) + "] " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    systemAvailable = false;
                    break;
                default:
                    System.out.println("Command not found, please try again!");
            }
        }
        scanner.close();
    }
}
