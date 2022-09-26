package week_test3;

import java.util.Scanner;

public class Find_power {

	public static void main(String[] args) {
		System.out.println("Enter the base");
		Scanner kb=new Scanner(System.in);
		int num1=kb.nextInt();
		System.out.println("Enter the index");
		int num2=kb.nextInt();
		int ans=1;
		if(num2==0)
		{
			ans=1;
		}else if(num2==1)
		{
			ans=num1;
		}else if(num2>1)
		{
			while(num2>0)
			{
				ans=ans*num1;
				num2--;
			}
		}
		System.out.println("ans is "+ans);

	}

}
