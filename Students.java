// Create Student as parent class and CollegeStudent as child class using extends.

class CollegeStudents{

    int rollNo;
    String name;

    // Step 1: Create a constructor to initialize data members of CollegeStudents class.

    CollegeStudents(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

        // Step 2: Create a method to dislay details of student.

        void displayCollegeStudentsDetails(){
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
    }
}       

// Step 3: Create a child class named Students that extends CollegeStudents class.

class Students extends CollegeStudents{
    String collegename;
    String course;

    //Step 4: Create a constructor to initialize data members of students class.

    Students(int rollNo, String name, String collegename, String course){
        super(rollNo, name); // Call Parent Class Constructor.
        this.collegename = collegename;
        this.course = course;
    }

    // Step 5: Create a method to display details of students.
    void displayStudentsDetails(){
        displayCollegeStudentsDetails(); // Call parent class method to display rollNo. and name.
        System.out.println("College Name: " + collegename);
        System.out.println("Course: " + course);

    }

       public static void main(String[] args) {
        
        // Step 6: Create an object of student Class.

        Students s1 = new Students(103, "Rahul", "GN Groups", "B.Tech (CSE)");

        // Step 7: Call method to display details of students class.

        s1.displayStudentsDetails();
        
       }
    }