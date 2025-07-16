package DataTypes;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        // Int, integer number; 32 bits; Min value: "-2.147.483.648"; Max Value: "2.147.483.647"
        // Byte, small integer number; 8 bits; Min Value: "-128"; Max Value: "127"
        // Short, integer numbers smaller than Int; 16 bits;  Min Value: "-32.768"; Max Value: "32.767"
        int age = 16;

        // Long, integer numbers greater than Int; 64 bits; Min Value: "-9.223.372.036.854.775.808"; Max Value: "9.223.372.036.854.775.807"
        long balance = 2147438648;

        // Float, floating number with simple precision; 32 Bits
        // Double, floating number with double precision; 64 Bits
        double height = 1.65;

        // Char, single character
        char sex = 'M';

        // Boolean, true or false
        boolean isNinja = true;

        // Output
        System.out.println("Age: " + age);
        System.out.println("Balance: " + balance);
        System.out.println("Height: " + height);
        System.out.println("Sex: " + sex);
        System.out.println("Is a ninja: " + isNinja);
    }
}
