// Print student name in original, uppercase, lowercase, and print length of name.

import java.util.Scanner;

public class StudentName{
    public static void main(String[] args){
        // Step 1: Create a scannner object to take input form user.

        Scanner sc = new Scanner(System.in);

        // Step 2: Ask user to enter Student name.

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        // Step : Print ORignal Name.

        System.out.println("Orignle Name: " + name);

        // Step 4: Find And PRint Length of the Name.

        System.out.println("Length of Name:" + name.length());

        // Step 5: Convert name to UpperCase.

        System.out.println("UpperCase: " + name.toUpperCase());

        // Step 6: Convert Name to LowerCase.

        System.out.println("Lowercase: " + name.toLowerCase());

        // Step 7: Close the object Scanner.

        sc.close();


    }
}