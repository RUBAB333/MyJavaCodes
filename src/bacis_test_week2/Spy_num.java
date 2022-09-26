package bacis_test_week2;

import java.util.Scanner;

public class Spy_num {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		int temp=num;
		int sum=0;
		int multi=1;
		while(temp>0)
		{
			int r=temp%10;
			sum=sum+r;
			multi=multi*r;
			temp=temp/10;
		}
		System.out.println(multi);
		if(multi==sum)
		{
			System.out.println("it is a spy number");
		}else
		{
			System.out.println("it is not a spy number");
		}

	}

}
