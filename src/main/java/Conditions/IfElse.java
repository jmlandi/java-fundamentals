package Conditions;

public class IfElse {
    public static void main(String[] args) {

        // Change the variable values to test the script
        String name =  "Luke Skywalker";
        int age = 22;
        boolean isRebelPilot = false;
        short numberOfFlights = 12;

        // if (something) {do this} else if (something) {do this} else {do this}
        if (isRebelPilot) {
            System.out.println(name + " is a rebel pilot!");
        } else if (age < 21 || age > 45) {
            System.out.println(name + " cannot be a rebel pilot!");
        } else if (numberOfFlights > 10) {
            System.out.println(name + " can be a rebel pilot!");
        } else {
            System.out.println(name + " is not a rebel pilot!");
        }

    }
}
