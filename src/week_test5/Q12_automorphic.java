package week_test5;

import java.util.Scanner;

public class Q12_automorphic {

	public static void main(String[] args) {
		System.out.println("enter the range");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		for(int i=1;i<=num;i++)
		{
			int a=i;
			int c=0;
			while(a>0)
			{
				int r=a%10;
				c++;
				a=a/10;
			}
			int d=1;
			while (c>0)
			{
				d=d*10;
				c--;
			}
			int ans1=i*i;
			int ans2=ans1%d;
			if(i==ans2)
			{
				System.out.println(i);
			}
			
			
		}

	}

}
