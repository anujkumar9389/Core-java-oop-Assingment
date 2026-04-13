// Create an array of 5 marks and print them using loop.

public class StudentMarks{
    public static void main(String[] args){

        // Step 1: Create an array to store marks of 5 students.

        int[] marks = {60, 80, 68, 96, 70};

        //Step 2: Print Heading.

        System.out.println("Student Marks: ");

        // Step 3: Use FOR loop to access each element of the array.

        for (int i = 0; i < marks.length; i++){

            // Step 4: Print Student Number and Corresponding Marks.

            System.out.println("Student: " + (i + 1) + " marks = " + marks[i]);

        }
    }

}