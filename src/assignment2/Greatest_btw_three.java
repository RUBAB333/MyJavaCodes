package assignment2;

import java.util.Scanner;

public class Greatest_btw_three {

	public static void main(String[] args) {
		System.out.println("enter the 1st number");
		Scanner keyboard = new Scanner(System.in);
		int num1 = keyboard.nextInt();
		System.out.println("enter the 2nd number");
		int num2 =keyboard.nextInt();
		System.out.println("enter the 3rd number");
		int num3 =keyboard.nextInt();
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is greater");
			}
		
		}
		else
		{
			if(num2>num3)
			{
				System.out.println(num2+" is greater");
			}
			else
			{
				System.out.println(num3+" is greater");
			}
		
		}
		
	
	}

}
