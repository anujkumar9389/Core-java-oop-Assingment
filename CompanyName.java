// Create a shared company name using static variable.

import java.util.Scanner;

public class CompanyName{

    int empID;
    String name;
    double salary;

    // Step 1: Create a static variable to store company name.

    static String CompanyName = "Oracle";

    // Step 2: Create a constructor to initialize data members.

    CompanyName(int empID, String name, double salary){
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }
        

        // Step 3: Create a method to display details of employee.

        public void displayEmployeeDetails(){
            System.out.println("Employee ID: " + empID);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee Salary: " + salary);
            System.out.println("Company name: " + CompanyName);
        }

            public static void main(String[] args){

                // Taking Input.

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Employee ID: ");
                int empID = sc.nextInt();
                sc.nextLine();

                System.out.println("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.println("Enter Employee Salary: ");
                double salary = sc.nextDouble();
                
                // Step 4: Create an object of CompanyName class.

            CompanyName c1 = new CompanyName(empID, name,  salary);
            
            // Step 5: Call method to display details of employee.

                c1.displayEmployeeDetails();

                // Step 6: Close the scanner object.
                sc.close();
     }
}