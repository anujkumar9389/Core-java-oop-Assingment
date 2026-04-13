// Create a Student class with rollNo, name, marks and display details using a method.

public class StudentDetails{
    
    // Step 1: Creating Data Members Of Student Class.

    int rollNo;
    String name;
    double marks;

    StudentDetails(int rollNo, String name, double marks){
        this.rollNo = 103;
        this.name = "Rahul";
        this.marks = 90.5;
    }
    

    // Step 2: Creating Method to Display Details.

    void displayDetails(){

        System.out.println("RollNo: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args){
      
        // Step 3: Creating Object Of Student Class.

    StudentDetails s1 = new StudentDetails(103, "Rahul", 90.5);
    
    // Step 4: Calling Method to display Details.

    s1.displayDetails();
    }
}