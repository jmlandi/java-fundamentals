package dataTypes;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        /*
        * What is the difference between Primitive data types and Non-Primitive data types?
        * Non-Primitive basically has methods at its default e.g. Strings, Arrays, Classes.
        */

        // String, to store multiple chars such as words
        String text = "this is my text";
        System.out.println("Text: " + text); // name without changes
        System.out.println("Transformed text: " + text.toUpperCase()); // name using a String method
    }
}
