import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int Number = 25;
        String Name = "Bassam";

        // Example of String concatenation
        System.out.println("My Name is: %S" + Name + "\nI have: " + Number + " Years old");

        // Example of formatted output
        System.out.printf("My Name is: %s\nI have: %d years old", Name, Number);

        // Using multiple variables in formatted output
        String name = "Bassam";
        int age = 25;
        String city = "Riyadh";
        String hobby = "Programming";

        System.out.printf(
            "My name is: %s\nI am %d years old\nI live in: %s\nMy hobby is: %s\n", 
            name, age, city, hobby
        );

        // Data types
        byte a = 123; // This type represents an 8-bit integer ranging from -127 to 127
        short y = 12345; // This type represents a 16-bit integer ranging from -32,768 to 32,767
        int m = 1234567; // This type represents a 32-bit integer ranging from -2,147,483,648 to 2,147,483,647
        long l = 1234567L; // This type represents a 64-bit integer ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float f = 12.05f; // This type represents a 32-bit floating-point number
        double d = 50.98794d; // This type represents a 64-bit floating-point number
        boolean check = true; // This type represents a boolean value, either true or false
        char a2 = 0; // This type represents a 16-bit Unicode character
        char letterA = 'A';

        // Reference/Object Data Types
        String website = "www.harmash.com"; // Example of a string
        String[] names = new String[10]; // Array of strings with a size of 10
        int[] numbers = new int[100]; // Array of integers with a size of 100
        float[] notes = new float[5]; // Array of floating-point numbers with a size of 5
        char[] alphabets = new char[26]; // Array of characters representing the alphabet with a size of 26
        Scanner input = new Scanner(System.in); // Scanner object for user input
    }
}
