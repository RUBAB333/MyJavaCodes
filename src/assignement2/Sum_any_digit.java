package assignement2;

import java.util.Scanner;

public class Sum_any_digit {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int sum = 0 ;
		
		while(num>0)
		{
			int ans = num%10 ;
			    sum = sum+ans ;
			    num = num/10 ;
			     
		}
		System.out.println("addition is "+sum);
	
		

	}

}
