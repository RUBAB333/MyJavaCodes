package week_test4;

import java.util.Scanner;

public class SumOfPositiveDigit {

	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int num=kb.nextInt();
		int sum=0;
		if(num>0)
		{
			for(int i=num;i>0;i=i/10)
			{
				int r=i%10;
				sum=sum+r;
			}
		}
		System.out.println(sum);
	}

}
