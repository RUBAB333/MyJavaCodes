package week_test4;

import java.util.Scanner;

public class Commission {

	public static void main(String[] args) {
		System.out.println("enter the sale amount");
		Scanner kb=new Scanner(System.in);
		int sale=kb.nextInt();
		if(sale>2000)
		{
			int commission=sale*5/100;
			System.out.println("commission is ="+commission);
		}else {
			System.out.println("Target not achieved");
		}

	}

}
