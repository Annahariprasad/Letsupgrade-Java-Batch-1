import java.util.Scanner;
public class Day8_1 {

	public static void main(String[] args) {
		// Day 8 - Assignment 1
		    Emp1 e1 = new Emp1();
	        e1.get_details();
	        e1.display_details();
	        Emp2 e2 = new Emp2();
	        e2.get_details();
	        e2.display_details();
	}

}

class Emp_details{
    String name, designation;
    int age;
    float salary;
    Scanner sc = new Scanner(System.in);
    
    public void get_details(){
        System.out.print("\nEnter Employee name : ");
        name = sc.next();
        System.out.print("Enter age : ");
        age = sc.nextInt();
        System.out.print("Enter salary : ");
        salary = sc.nextFloat();
        System.out.print("Enter designation : ");
        designation = sc.next();
    }

    public void display_details(){
        System.out.println("\n<--Employee details-->");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        System.out.println("Designation : "+designation);
    }
    
}

class Emp1 extends Emp_details{

}

class Emp2 extends Emp_details{

}
