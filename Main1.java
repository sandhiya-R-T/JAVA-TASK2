package OOPSinJava;

class Person {
    protected String name;
	protected int age;

    public Person(String name, int age) {
    this.name = name;
    this.age = age;
}


public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}
}

class Employee extends Person {
   private int employeeID;
   private double salary;

   public Employee(String name, int age, int employeeID, double salary) {
    super(name, age); // Call the constructor of the superclass (Person)
    this.employeeID = employeeID;
    this.salary = salary;
}

   public void displayEmployeeDetails() {
    System.out.println("Employee ID: " + employeeID);
    System.out.println("Salary: $" + salary);
}
}

public class Main1 {
public static void main(String[] args) {
            Employee employee = new Employee("Vijay", 25, 12345, 50000.0);

    System.out.println("Person Details:");
    employee.displayDetails();
    System.out.println("\nEmployee Details:");
    employee.displayEmployeeDetails();
}
}
