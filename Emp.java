

class Emp {
    // Data members (fields)
    int id;
    String name;

    // Constructor
    Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("----------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Creating employee objects
        Emp emp1 = new Emp(101, "Alice");
        Emp  emp2 = new Emp(102, "Bob");

        // Displaying details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}


    

