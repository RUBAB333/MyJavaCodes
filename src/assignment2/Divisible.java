package assignment2;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		
		if(num%5==0)
		{
			System.out.println("number is divisible by 5");
		}
		else
		{
			System.out.println("number is not divisible by 5");
		}
		
	}

}
