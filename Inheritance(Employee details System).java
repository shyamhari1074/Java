import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phno;
    String add;
    double Sal;

    // Constructor for Employee class
    public Employee(String name, int age, String phno, String add, double Sal) {
        this.name = name;
        this.age = age;
        this.phno = phno;
        this.add = add;
        this.Sal = Sal;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary = " + Sal);
    }

    // Method to print details of the employee
    public void printdetails() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Phone number = " + phno);
        System.out.println("Address = " + add);
        printSalary();
    }
}

// Officer class that inherits from Employee
class Officer extends Employee {
    String Specialization;

    // Constructor for Officer class
    public Officer(String name, int age, String phno, String add, double Sal, String specialization) {
        super(name, age, phno, add, Sal);
        this.Specialization = specialization;
    }

    @Override
    public void printdetails() {
        super.printdetails();
        System.out.println("Specialization = " + Specialization);
    }
}

// Manager class that inherits from Employee
class Manager extends Employee {
    String Dept;

    // Constructor for Manager class
    public Manager(String name, int age, String phno, String add, double Sal, String dept) {
        super(name, age, phno, add, Sal);
        this.Dept = dept;
    }

    @Override
    public void printdetails() {
        super.printdetails();
        System.out.println("Department = " + Dept);
    }
}

// Main class
public class Test {
    public static void main(String[] args) {
        Scanner Av = new Scanner(System.in);

        // Input for Officer
        System.out.println("Enter the Officer details:");
        System.out.print("Name: ");
        String offname = Av.nextLine();
        System.out.print("Age: ");
        int offage = Av.nextInt();
        Av.nextLine(); // Clear the newline
        System.out.print("Phone number: ");
        String offphno = Av.nextLine();
        System.out.print("Address: ");
        String offadd = Av.nextLine();
        System.out.print("Salary: ");
        double offsal = Av.nextDouble();
        Av.nextLine(); // Clear the newline
        System.out.print("Specialization: ");
        String offspec = Av.nextLine();

        Officer officer = new Officer(offname, offage, offphno, offadd, offsal, offspec);
        System.out.println("\nOfficer Details:");
        officer.printdetails();

        System.out.println();

        // Input for Manager
        System.out.println("Enter the Manager details:");
        System.out.print("Name: ");
        String manname = Av.nextLine();
        System.out.print("Age: ");
        int manage = Av.nextInt();
        Av.nextLine(); // Clear the newline
        System.out.print("Phone number: ");
        String manphno = Av.nextLine();
        System.out.print("Address: ");
        String manadd = Av.nextLine();
        System.out.print("Salary: ");
        double mansal = Av.nextDouble();
        Av.nextLine(); // Clear the newline
        System.out.print("Department: ");
        String mandept = Av.nextLine();

        Manager manager = new Manager(manname, manage, manphno, manadd, mansal, mandept);
        System.out.println("\nManager Details:");
        manager.printdetails();

        Av.close();
    }
}
