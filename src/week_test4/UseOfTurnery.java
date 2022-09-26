package week_test4;

import java.util.Scanner;

public class UseOfTurnery {

	public static void main(String[] args) {
		System.out.println("enter the sale");
		Scanner kb=new Scanner(System.in);
		int sale=kb.nextInt();
        float ans=sale>15000?sale*5/100:0.0f;
		System.out.println("comm = "+ans);		

	}

}
