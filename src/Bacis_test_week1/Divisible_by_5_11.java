package Bacis_test_week1;

import java.util.Scanner;

public class Divisible_by_5_11 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		/*String ans =(num%5==0)&&(num%11==0)?"it is divisible by 5 and 11"
			             :"it not is divisible by 5 and 11";
		System.out.println(ans);*/
		if(num%5==0)
		{
			if(num%11==0)
			{
				System.out.println(num+" is divisible by 5 and 11");
			}
			else
			{
				System.out.println(num+" is not divisible by 5 and 11");
			}
		}
		
	}

}
