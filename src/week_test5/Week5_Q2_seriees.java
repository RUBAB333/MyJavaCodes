package week_test5;

import java.util.Scanner;

public class Week5_Q2_seriees {
	
	public static void main(String[] args) {
		int sum=1;
		System.out.println("enter position");
		Scanner kb=new Scanner(System.in);
		int num2=kb.nextInt();
		for(int i=0;i<=num2;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
