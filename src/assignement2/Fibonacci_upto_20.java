package assignement2;

import java.util.Scanner;

public class Fibonacci_upto_20 {

	public static void main(String[] args) {
		System.out.println("enter tne 1st number");
		Scanner kb = new Scanner(System.in);
		int num1 = kb.nextInt();
		System.out.println("enter the 2nd number");
		int num2 = kb.nextInt();
		for(int i=1;i>=20;i++)
		{
			 int ans = num1+num2 ;
			    System.out.println(ans);
			    num1 = num2 ;
			    num2 = ans ;
			    
		}

	}

}
