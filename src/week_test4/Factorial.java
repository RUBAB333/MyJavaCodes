package week_test4;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		int sum=1;
		for(int i=num;i>0;i--)
		{
			sum=sum*i;
		}
		System.out.println(sum);

	}

}
