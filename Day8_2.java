import java.util.Scanner;

public class Day8_2 {
	
	public static Scanner scan;
    public static String name,designation;
    private static int age;
    private static double salary;

	public static void main(String[] args) {
		int choice = 0;
        Employee[] employees = new Employee[3];
        scan = new Scanner(System.in);


        for(int i=0;i<3;i++) {

            System.out.println("1. Doctor\n2. Engineer\n3. Pilot");
            System.out.println("Enter your choice : ");
            choice = scan.nextInt();

            switch (choice) {

                case 1:
                    details();
                    System.out.println("IsDoctor Certified");
                    boolean iscertified = scan.nextBoolean();
                    employees[i] = new Employee(name, age, salary, designation);
                    break;
                case 2:
                    details();
                    System.out.println("Engineer details");
                    employees[i] = new Employee(name, age, salary, designation);
                    break;
                case 3:
                    details();
                    System.out.println("Pilot Details");
                    employees[i] = new Employee(name, age, salary, designation);
                    break;
                default:
                    System.out.println("Enter valid choice");

            }
        }

        System.out.println("Employee Details");
        for(int i=0;i<3;i++) {
            System.out.println(employees[i].getName());
            System.out.println(employees[i].getAge());
            System.out.println(employees[i].getSalary());
            System.out.println(employees[i].getDesignation());
        }

    }

    private static void details() {
        System.out.println("Enter Name");
        name = scan.next();
        System.out.println("Enter age");
        age = scan.nextInt();
        System.out.println("Enter salary");
        salary = scan.nextDouble();
        System.out.println("Enter Designation");
        designation = scan.next();
    }

}

public class Employee {

    private String name,designation;
    private int age;
    private double salary;

    //public Employee() {
    //}

    public Employee(String name, int age, double salary, String designation)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

public class Engineer extends  Employee {

    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}

public class Doctor extends Employee {

    private boolean isCertified;

    public boolean isCertified() {
        return isCertified;
    }

    public void setCertified(boolean certified) {
        isCertified = certified;
    }
}

public class Pilot extends Employee {

    public void startFlight(){

    }

    public void drive(){

    }

    public void stopFlight(){

    }

}