package week_test4;

import java.util.Scanner;

public class PrintWorkPlace {

	public static void main(String[] args) {
		System.out.println("Enter Age");
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		System.out.println("Enter sex (M or F)");
		char b=kb.next().charAt(0);
		System.out.println("Enter marital Status (Y or N)");
		char c=kb.next().charAt(0);
		
		if((a>=20)&&(a<60))
		{
			if((b=='f'||b=='F') && (a>=20&&a<=60))
			{
				System.out.println("place of service = Urban areas only");
			}else if((b=='m'||b=='M') && (a>=20&&a<=40))
			{
				System.out.println("place of service = Can Work Anywhere ");
			}else if((b=='m'||b=='M') && (a>40&&a<=60))
			{
				System.out.println("place of service = Urban areas only");
			}
		
		}else
		{
			System.out.println("ERROR");
		}
		
		
	}

}
