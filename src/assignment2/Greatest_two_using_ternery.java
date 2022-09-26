package assignment2;

import java.util.Scanner;

public class Greatest_two_using_ternery {

	public static void main(String[] args) {
		System.out.println("enter the 1st number");
		Scanner keyboard = new Scanner(System.in);
		int num1 = keyboard.nextInt();
		System.out.println("enter the 2nd number");
		int num2 =keyboard.nextInt();
		int result=(num1>num2)? num1 : num2 ;
		System.out.println(result+" is greater");
		
	}
	

}
