//Day 4 - Assignment_3

import java.util.Scanner;

public class Sum_Array_Values {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
	        int array[] = new int[5], sum = 0;
	        
	        for(int i=0; i<5; i++){
	            System.out.print("Enter element of "+i+" index : ");
	            array[i] = sc.nextInt();
	        }

	        for(int i=0; i<5; i++){
	            sum = sum+array[i];
	        }

	        System.out.println("\nSum of the array values : "+sum);

	}

}
