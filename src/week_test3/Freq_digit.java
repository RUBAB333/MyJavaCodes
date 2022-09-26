package week_test3;

import java.util.Scanner;

public class Freq_digit {

	public static void main(String[] args) {
		System.out.println("Enter the mobile number");
		Scanner kb=new Scanner(System.in);
	    long num=kb.nextLong();
	    System.out.println("Enter digit");
	    long d=kb.nextLong();
		int f=0;
		for(long i=num;i>0;i=i/10)
		{
			long r=i%10;
			if(d==r)
			{
				f++;
			}
		}
		System.out.println("frequency of "+d+" is ="+f);

	}

}
