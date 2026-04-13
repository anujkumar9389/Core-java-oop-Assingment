// Create an Employee or Trainer class with empId, empName, salary using constructor.

import java.util.Scanner;

public class TrainerDetails{

    // Step 1: Createing Constructor to initialize data members.

    int empID;
    String name;
    double salary;

    TrainerDetails(int empID, String name, double salary){
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }
      
       // Step 2: create a method to display details of employee.

       public void displayTrainerDetails(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
       }

        public static void main(String[] args){
            // taking Input.

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Employee ID: ");
            int empID = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Employee Salary: ");
            double salary = sc.nextDouble();

            // Step 3: Create an object of TrainerDetails class.

            TrainerDetails t1 = new TrainerDetails(empID, name, salary);

            // Step 4: Call method to display details of employee.

            t1.displayTrainerDetails();

            // Step 5: Close the Scanner Object.

            sc.close();

        }
   
}