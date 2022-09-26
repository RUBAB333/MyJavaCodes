package assignement2;

import java.util.Scanner;

public class Krishnamurty_numbear {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		int ans1=num;
		int ans2=1;
		int b=1;
		int ans3=0;
		while(ans1>0)
		{
			int a=ans1%10;
			while(a>0)
			{
			    ans2=a*ans2;
			    a=0;
			}
			ans3=ans3+ans2;
		 ans1=ans1/10;
			
		}
		System.out.println(ans3);
		if(num==ans3)
		{
			System.out.println("krishnamurti");
		}
		else
		{
			System.out.println("not a krishnamurti");
		}
		
		
		

	}

}
