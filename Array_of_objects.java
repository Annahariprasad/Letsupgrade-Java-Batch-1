//Day 4 - Assignment_1

import java.util.Scanner;

public class Array_of_objects {

	public static void main(String[] args) {
			Avenger avenger[] = new Avenger[5];
		        for(int i=0; i<5; i++){
		            avenger[i] = new Avenger();
		            avenger[i].getDetails();
		        }
		        for(int i=0; i<5; i++){
		            avenger[i].displayDetails();
		        }  
		    }
		}

		class Avenger{
		    Scanner sc = new Scanner(System.in);
		    public String name, weapon, planet, power; 
		    public int age;
		    void getDetails(){
		        System.out.print("\nEnter Avenger name : ");
		        name = sc.next();
		        System.out.print("Enter Avenger age : ");
		        age = sc.nextInt();
		        System.out.print("Enter Avenger power : ");
		        power = sc.next();
		        System.out.print("Enter Avenger weapon : ");
		        weapon = sc.next();
		        System.out.print("Enter Avenger planet : ");
		        planet = sc.next();
		   }
		    void displayDetails(){
		        System.out.println("\nAvenger name is "+name);
		        System.out.println("Avenger age is "+age);
		        System.out.println("Avenger power is "+power);
		        System.out.println("Avenger weapon is "+weapon);
		        System.out.println("Avenger planet is "+planet);
		  }
}



