package bacis_test_week2;

import java.util.Scanner;

public class Trimorphic_number {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		int temp1=num;
		int temp2=temp1;
		int a=0;
		while(temp1>0)
		{
			int r=temp1%10;
			a++;
			temp1=temp1/10;
		}
		int b=1;
		while(a>0)
		{
			b=b*10;
			a--;
		}
		int ans1=temp2*temp2*temp2;
		int ans2=ans1%b;
		if(num==ans2)
		{
			System.out.println("number is trimorphic");
		}else
		{
			System.out.println("number is not trimorphic");
		}
		

	}

}
