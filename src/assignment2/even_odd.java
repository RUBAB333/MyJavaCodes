package assignment2;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner keyboard = new Scanner(System.in);
		int num = keyboard.nextInt();
		int ans = num%2;
		if(ans==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		

	}

}
