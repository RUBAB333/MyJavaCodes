package assignment2;

import java.util.Scanner;

public class Positive_neg_zero {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else if(num<0)
		{
			System.out.println("Number is negative");
		}
		else if(num==0)
		{
			System.out.println("Number is zero");
		}
		
		

	}

}
