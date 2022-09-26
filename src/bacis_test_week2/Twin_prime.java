package bacis_test_week2;

import java.util.Scanner;

public class Twin_prime {

	public static void main(String[] args) {
		System.out.println("enter 1st number");
		Scanner kb=new Scanner(System.in);
		int num1=kb.nextInt();
		int temp1=num1;
		boolean ans1=true;
		int a=2;
		if(num1==1)
		{
		 System.out.println("prime");	
		}
		else if(num1>a) 
		{
		while(temp1>a)
		{
			ans1=true;
			if(temp1%a==0)
			{
				ans1=false;
				break;
			}
			a++;
		}
		if(ans1==true)
		{
			System.out.println("prime");
		}else {
			System.out.println(num1+" not prime");
		}
		}else {
			System.out.println(num1+" not prime");
		}
		System.out.println("enter 2nd number");
		int num2=kb.nextInt();
		int temp2=num2;
		boolean ans2=true;
		int b=2;
		if(temp2==1)
		{
		 System.out.println("prime");	
		}
		else if(temp2>b) 
		{
		while(temp2>b)
		{
			ans2=true;
			if(temp2%b==0)
			{
				ans2=false;
				break;
			}
			b++;
		}
		if(ans2==true)
		{
			System.out.println("prime");
		}else {
			System.out.println(num2+" not prime");
		}
		}else {
			System.out.println(num2+" not prime");
		}
		if(ans1==ans2)
		{
			int ans3=num1-num2;
			if(ans3==2||ans3==-2)
			{
				System.out.println(" both are twin prime");
			}
		}else
		{
			System.out.println("both are not twin prime");
		}
		
		
		
		
	}

}
